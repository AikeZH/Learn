package chapter16.section7.arrays;

import util.Generator;
import util.RandomGenerator;

import java.util.Arrays;

/**
 * TODO
 * Using Arrays.binarySearch()
 *
 * @author zhanghua
 * @date 2020/11/18
 */
public class ArraySearching {
    public static void main(String[] args) {
        Generator<Integer> gen = new RandomGenerator.Integer(1000);
        // TODO
        int[] a = {gen.next(), gen.next(), gen.next(), gen.next(), gen.next(), gen.next(), gen.next(), gen.next(), gen.next(), gen.next(), gen.next(), gen.next(), gen.next(), gen.next(), gen.next(), gen.next(), gen.next(), gen.next(), gen.next(), gen.next(), gen.next(), gen.next(), gen.next(), gen.next(), gen.next()};
        Arrays.sort(a);
        System.out.println("Sorted array: " + Arrays.toString(a));
        while (true) {
            int r = gen.next();
            int location = Arrays.binarySearch(a, r);
            System.out.println("Location:"+location);
            if (location >= 0) {
                System.out.println("Location of " + r + " is " + location + ", a[" + location + "] = " + a[location]);
                // Out of while loop
                break;
            }
        }
    }
    /*
    Sorted array: [128, 140, 200, 207, 258, 258, 278, 288, 322,
    429, 511, 520, 522, 551, 555, 589, 693, 704, 809, 861, 861,
    868, 916, 961, 998]
    Location of 322 is 8, a[8] = 322
     */
}
