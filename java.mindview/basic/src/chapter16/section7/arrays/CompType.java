package chapter16.section7.arrays;

import util.Generator;

import java.util.Arrays;
import java.util.Random;

/**
 * TODO
 * Implementing Comparable in a class
 *
 * @author zhanghua
 * @date 2020/11/18
 */
public class CompType implements Comparable<CompType> {
    int i;
    int j;
    private static int count = 1;

    private static Random random = new Random(47);

    public CompType(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String toString() {
        String result = "[i = " + i + ", j = " + j + "]";
        if (count++ % 3 == 0) {
            result += "\n";
        }
        return result;
    }

    @Override
    public int compareTo(CompType rv) {
        return i < rv.i ? -1 : (i == rv.i ? 0 : 1);
    }

    public static Generator<CompType> generator() {
        return new Generator<CompType>() {
            @Override
            public CompType next() {
                return new CompType(random.nextInt(100), random.nextInt(100));
            }
        };
    }

    public static void main(String[] args) {
        // TODO
        CompType[] a = {CompType.generator().next(),CompType.generator().next(),CompType.generator().next(),CompType.generator().next(),CompType.generator().next(),CompType.generator().next(),CompType.generator().next(),CompType.generator().next(),CompType.generator().next(),CompType.generator().next(),CompType.generator().next(),CompType.generator().next()};
        System.out.println("before sorting:");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("after sorting:");
        System.out.println(Arrays.toString(a));
    }
    /* Output:
    before sorting:
    [[i = 58, j = 55], [i = 93, j = 61], [i = 61, j = 29]
    , [i = 68, j = 0], [i = 22, j = 7], [i = 88, j = 28]
    , [i = 51, j = 89], [i = 9, j = 78], [i = 98, j = 61]
    , [i = 20, j = 58], [i = 16, j = 40], [i = 11, j = 22]
    ]
    after sorting:
    [[i = 9, j = 78], [i = 11, j = 22], [i = 16, j = 40]
    , [i = 20, j = 58], [i = 22, j = 7], [i = 51, j = 89]
    , [i = 58, j = 55], [i = 61, j = 29], [i = 68, j = 0]
    , [i = 88, j = 28], [i = 93, j = 61], [i = 98, j = 61]
    ]
     */
}
