package chapter15.section7.generics;

import java.util.ArrayList;

/**
 * @author ZhangHua
 * @date 2020/11/9
 */
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);
    }
    /* Output:
    true
     */
}
