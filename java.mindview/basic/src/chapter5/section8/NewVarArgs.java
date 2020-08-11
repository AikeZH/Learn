package chapter5.section8;

/**
 * initialization/NewVarArgs.java
 * Using array syntax to create variable argument lists
 *
 * @author zhanghua
 * @date 2020/7/22
 */
public class NewVarArgs {
    static void printArray(Object... args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Can take individual elements:
        printArray(new Integer(47), new Float(3.14), new Double(11.11));
        printArray(47, 3.14F, 11.11);
        printArray("one", "two", "three");
        printArray(new A(), new A(), new A());
        // Or an array
        printArray((Object[]) new Integer[]{1,2,3,4});
        printArray(); // Empty list is OK
    }
    /* Output: (75% match)
    47 3.14 11.11
    47 3.14 11.11
    one two three
    chapter5.section8.A@2db0f6b2 chapter5.section8.A@3cd1f1c8 chapter5.section8.A@3a4afd8d
    1 2 3 4
     */
}
