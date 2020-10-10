package chapter12.section8.exceptions;

/**
 * The finally clause is always executed
 * @author zhanghua
 * @date 2020/10/10
 */
public class FinallyWorks {
    static int count = 0;

    public static void main(String[] args) {
        while (true) {
            try {
                // Post-increment is zero first time
                if (count++ == 0) {
                    throw new ThreeException();
                }
                System.out.println("No exception");
            } catch (ThreeException e) {
                System.out.println("ThreeException");
            } finally {
                System.out.println("In finally clause");
                if (count == 2) {
                    // out of "while"
                    break;
                }
            }
        }
    }
    /* Output:
    ThreeException
    In finally clause
    No exception
    In finally clause
     */
}
class ThreeException extends Exception{}
