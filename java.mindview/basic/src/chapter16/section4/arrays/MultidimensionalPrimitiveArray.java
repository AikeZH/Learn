package chapter16.section4.arrays;

import java.util.Arrays;

/**
 * Creating multidimensional arrays
 *
 * @author ZhangHua
 * @date 2020/11/16
 */
public class MultidimensionalPrimitiveArray {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println(Arrays.deepToString(a));
    }
    /* Output:
    [[1, 2, 3], [4, 5, 6]]
     */
}
