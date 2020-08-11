package chapter5.section8;

/**
 * initialization/VarArgs.java
 * Using array syntax to create variable argument lists.
 *
 * @author zhanghua
 * @date 2020/7/22
 */

public class VarArgs {
    static void printArray(Object[] args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[]{
                new Integer(47), new Float(3.14), new Double(11.11)
        });
        printArray(new Object[]{47, 3.14F, 11.11});
        printArray(new Object[]{"one", "two", "three"});
        printArray(new Object[]{new A(), new A(), new A()});
    }
    /* Output: (Sample)
        47 3.14 11.11
        one two three
        chapter5.section8.A@2db0f6b2 chapter5.section8.A@3cd1f1c8 chapter5.section8.A@3a4afd8d
     */
}
