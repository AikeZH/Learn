package chapter12.section8.exceptions;

/**
 * Finally is always executed
 *
 * @author zhanghua
 * @date 2020/10/10
 */
public class AlwaysFinally {
    public static void main(String[] args) {
        System.out.println("Entering first try block");
        try {
            System.out.println("Entering second try block");
            try {
                throw new FourException();
            } finally {
                System.out.println("Finally in 2nd try block");
            }
        } catch (FourException e) {
            System.out.println("Caught FourException in 1st try block");
        } finally {
            System.out.println("Finally in 1st try block");
        }
    }
    /* Output:
    Entering first try block
    Entering second try block
    Finally in 2nd try block
    Caught FourException in 1st try block
    Finally in 1st try block
     */
}

class FourException extends Exception {
}