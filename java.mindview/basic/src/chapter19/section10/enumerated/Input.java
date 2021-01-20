package chapter19.section10.enumerated;

import java.util.Random;

/**
 * @author zhanghua
 * @date 2021/1/20
 */
public enum Input {
    NICKEL(5), DIME(10), QUARTER(25), DOLLAR(100),
    TOOTHPASTE(200), CHIPS(75), SODA(100), SOAP(50),
    ABORT_TRANSACTION {
        @Override
        int amount() {
            // Disallow
            throw new RuntimeException("ABORT.amount()");
        }
    },
    STOP {
        // This must be the last instance.
        @Override
        int amount() {
            // Disallow
            throw new RuntimeException("SHUT_DOWN.amount()");
        }
    };
    // In cents
    int value;

    Input() {
    }

    Input(int value) {
        this.value = value;
    }

    // In cents
    int amount() {
        return value;
    }

    static Random random = new Random(47);

    public static Input randomSelection() {
        // Don't include STOP;
        return values()[random.nextInt(values().length - 1)];
    }
}
