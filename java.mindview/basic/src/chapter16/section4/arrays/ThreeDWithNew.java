package chapter16.section4.arrays;

import java.util.Arrays;

/**
 * @author ZhangHua
 * @date 2020/11/16
 */
public class ThreeDWithNew {
    public static void main(String[] args) {
        // 3-D array with fixed length
        int[][][] a = new int[2][2][4];
        System.out.println(Arrays.deepToString(a));
    }
    /* Output:
    [[[0, 0, 0, 0], [0, 0, 0, 0]], [[0, 0, 0, 0], [0, 0, 0, 0]]]
     */
}
