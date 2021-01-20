package chapter19.section11.enumerated;

import java.util.Random;

import static chapter19.section11.enumerated.Outcome.*;

/**
 * Demonstration of multiple dispatching
 *
 * @author ZhangHua
 * @date 2021/1/20
 */
public class RoShamBo1 {
    static final int SIZE = 20;
    private static Random random = new Random(47);

    public static Item newItem() {
        switch (random.nextInt(3)) {
            default:
            case 0:
                return new Scissors();
            case 1:
                return new Paper();
            case 2:
                return new Rock();
        }
    }

    public static void match(Item a, Item b) {
        System.out.println(a + " vs. " + b + ": " + a.compete(b));
    }

    public static void main(String[] args) {
        for (int i = 0; i < SIZE; i++) {
            match(newItem(), newItem());
        }
    }
    /* Output:
    Rock vs. Rock: DRAW
    Paper vs. Rock: WIN
    Paper vs. Rock: WIN
    Paper vs. Rock: WIN
    Scissors vs. Paper: WIN
    Scissors vs. Scissors: DRAW
    Scissors vs. Paper: WIN
    Rock vs. Paper: LOSE
    Paper vs. Paper: DRAW
    Rock vs. Paper: LOSE
    Paper vs. Scissors: LOSE
    Paper vs. Scissors: LOSE
    Rock vs. Scissors: WIN
    Rock vs. Paper: LOSE
    Paper vs. Rock: WIN
    Scissors vs. Paper: WIN
    Paper vs. Scissors: LOSE
    Paper vs. Scissors: LOSE
    Paper vs. Scissors: LOSE
    Paper vs. Scissors: LOSE
     */
}

interface Item {
    Outcome compete(Item item);

    Outcome eval(Paper paper);

    Outcome eval(Scissors scissors);

    Outcome eval(Rock rock);
}

class Paper implements Item {
    @Override
    public Outcome compete(Item item) {
        return item.eval(this);
    }

    @Override
    public Outcome eval(Paper paper) {
        return DRAW;
    }

    @Override
    public Outcome eval(Scissors scissors) {
        return WIN;
    }

    @Override
    public Outcome eval(Rock rock) {
        return LOSE;
    }

    @Override
    public String toString() {
        return "Paper";
    }
}

class Scissors implements Item {
    @Override
    public Outcome compete(Item item) {
        return item.eval(this);
    }

    @Override
    public Outcome eval(Paper paper) {
        return LOSE;
    }

    @Override
    public Outcome eval(Scissors scissors) {
        return DRAW;
    }

    @Override
    public Outcome eval(Rock rock) {
        return WIN;
    }

    @Override
    public String toString() {
        return "Scissors";
    }
}

class Rock implements Item {
    @Override
    public Outcome compete(Item item) {
        return item.eval(this);
    }

    @Override
    public Outcome eval(Paper paper) {
        return WIN;
    }

    @Override
    public Outcome eval(Scissors scissors) {
        return LOSE;
    }

    @Override
    public Outcome eval(Rock rock) {
        return DRAW;
    }

    @Override
    public String toString() {
        return "Rock";
    }
}