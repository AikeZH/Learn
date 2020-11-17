package chapter16.section4.arrays;

import java.util.Arrays;

/**
 * Creating multidimensional arrays
 *
 * @author ZhangHua
 * @date 2020/11/16
 */
public class AssemblingMultidimensionalArrays {
    public static void main(String[] args) {
        Integer[][] a;
        a = new Integer[3][];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Integer[3];
            for (int j = 0; j < a[i].length; j++) {
                // Autoboxing
                a[i][j] = i * j;
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
    /* Output:
    [[0, 0, 0], [0, 1, 2], [0, 2, 4]]
     */
}
