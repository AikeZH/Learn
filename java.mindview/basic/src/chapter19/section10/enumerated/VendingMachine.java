package chapter19.section10.enumerated;

import util.Generator;
import util.TextFile;

import java.util.EnumMap;
import java.util.Iterator;

import static chapter19.section10.enumerated.Input.*;

/**
 * {Args: VendingMachineInput.txt}
 *
 * @author zhanghua
 * @date 2021/1/20
 */
public class VendingMachine {
    private static State state = State.RESTING;
    private static int amount = 0;
    private static Input selection = null;

    enum StateDuration {
        // Tagging enum
        TRANSIENT
    }

    enum State {
        RESTING {
            @Override
            void next(Input input) {
                switch (Category.categorize(input)) {
                    case MONEY:
                        amount += input.amount();
                        state = ADDING_MONEY;
                        break;
                    case SHUT_DOWN:
                        state = TERMINAL;
                    default:
                }
            }
        },
        ADDING_MONEY {
            @Override
            void next(Input input) {
                switch (Category.categorize(input)) {
                    case MONEY:
                        amount += input.amount();
                        break;
                    case ITEM_SELECTION:
                        selection = input;
                        if (amount < selection.amount()) {
                            System.out.println("Insufficient money for " + selection);
                        } else {
                            state = DISPENSING;
                        }
                        break;
                    case QUIT_TRANSACTION:
                        state = GIVING_CHANGE;
                        break;
                    case SHUT_DOWN:
                        state = TERMINAL;
                    default:
                }
            }
        },
        DISPENSING(StateDuration.TRANSIENT) {
            @Override
            void next() {
                System.out.println("Here is your " + selection);
                amount -= selection.amount();
                state = GIVING_CHANGE;
            }
        },
        GIVING_CHANGE(StateDuration.TRANSIENT) {
            @Override
            void next() {
                if (amount > 0) {
                    System.out.println("Your change: " + amount);
                    amount = 0;
                }
                state = RESTING;
            }
        },
        TERMINAL {
            @Override
            void output() {
                System.out.println("Halted");
            }
        };
        private boolean isTransient = false;

        State() {
        }

        State(StateDuration trans) {
            isTransient = true;
        }

        void next(Input input) {
            throw new RuntimeException("Only call next(Input input) for non-transient states");
        }

        void next() {
            throw new RuntimeException("Only call next() for StateDuration.TRANSIENT states");
        }

        void output() {
            System.out.println(amount);
        }
    }

    static void run(Generator<Input> generator) {
        while (state != State.TERMINAL) {
            state.next(generator.next());
            while (state.isTransient) {
                state.next();
            }
            state.output();
        }
    }

    public static void main(String[] args) {
        Generator<Input> generator = new RandomInputGenerator();
        if (args.length == 1) {
            generator = new FileInputGenerator(args[0]);
        }
        run(generator);
    }
    /* Output:
    25
    50
    75
    Here is your CHIPS
    0
    100
    200
    Here is your TOOTHPASTE
    0
    25
    35
    Your change: 35
    0
    25
    35
    Insufficient money for SODA
    35
    60
    70
    75
    Insufficient money for SODA
    75
    Your change: 75
    0
    Halted
     */
}

enum Category {
    MONEY(NICKEL, DIME, QUARTER, DOLLAR),
    ITEM_SELECTION(TOOTHPASTE, CHIPS, SODA, SOAP),
    QUIT_TRANSACTION(ABORT_TRANSACTION),
    SHUT_DOWN(STOP);

    Input[] values;

    Category(Input... values) {
        this.values = values;
    }

    private static EnumMap<Input, Category> categoryEnumMap = new EnumMap<>(Input.class);

    static {
        for (Category item : Category.values()) {
            for (Input value : item.values) {
                categoryEnumMap.put(value, item);
            }
        }
    }

    public static Category categorize(Input input) {
        return categoryEnumMap.get(input);
    }
}

// For a basic sanity check
class RandomInputGenerator implements Generator<Input> {
    @Override
    public Input next() {
        return Input.randomSelection();
    }
}

// Create Inputs from a file of ';' -separated strings
class FileInputGenerator implements Generator<Input> {
    private Iterator<String> input;

    public FileInputGenerator(String fileName) {
        input = new TextFile(fileName, ";").iterator();
    }

    @Override
    public Input next() {
        if (!input.hasNext()) {
            return null;
        }
        return Enum.valueOf(Input.class, input.next().trim());
    }
}
