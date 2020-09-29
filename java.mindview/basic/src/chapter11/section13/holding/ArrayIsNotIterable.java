package chapter11.section13.holding;

import java.util.Arrays;

/**
 * @author zhanghua
 * @date 2020/9/29
 */
public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> ib) {
        for (T t : ib) {
            System.out.print(t + " ");
        }
    }

    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
        String[] strings = {"A", "B", "C"};
        // An array works in foreach, but it's not Iterable
        //! test(strings);
        test(Arrays.asList(strings));
    }
    /* Output:
    1 2 3 A B C
     */
}
