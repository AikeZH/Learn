package chapter16.section4.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * @author ZhangHua
 * @date 2020/11/16
 */
public class RaggedArray {
    public static void main(String[] args) {
        Random random = new Random(47);
        // 3-D array with varied-length vectors
        int[][][] a = new int[random.nextInt(7)][][];
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[random.nextInt(5)][];
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = new int[random.nextInt(5)];
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
    /* Output:
    [[], [[0], [0], [0, 0, 0, 0]], [[], [0, 0], [0, 0]],
    [[0, 0, 0], [0], [0, 0, 0, 0]], [[0, 0, 0], [0, 0, 0], [0], []],
    [[0], [], [0]]]
     */
}
