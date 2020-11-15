package chapter16.section3.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Returning arrays from methods
 *
 * @author ZhangHua
 * @date 2020/11/15
 */
public class IceCream {
    private static Random random = new Random(47);
    static final String[] FLAVORS = {
            "Chocolate", "Strawberry", "Vanilla Fudge Swirl",
            "Mint Chip", "Mocha Almond Fudge", "Rum Raisin",
            "Praline Cream", "Mud Pie"
    };

    public static String[] flavorSet(int n) {
        if (n > FLAVORS.length) {
            throw new IllegalArgumentException("Set too big");
        }
        String[] result = new String[n];
        boolean[] picked = new boolean[FLAVORS.length];
        for (int i = 0; i < n; i++) {
            int t;
            do {
                t = random.nextInt(FLAVORS.length);
            } while (picked[t]);
            result[i] = FLAVORS[t];
            picked[t] = true;
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.println(Arrays.toString(flavorSet(3)));
        }
    }
    /* Output:
    [Rum Raisin, Mint Chip, Mocha Almond Fudge]
    [Chocolate, Strawberry, Mocha Almond Fudge]
    [Strawberry, Mint Chip, Mocha Almond Fudge]
    [Rum Raisin, Vanilla Fudge Swirl, Mud Pie]
    [Vanilla Fudge Swirl, Chocolate, Mocha Almond Fudge]
    [Praline Cream, Strawberry, Mocha Almond Fudge]
    [Mocha Almond Fudge, Strawberry, Mint Chip]
     */
}
