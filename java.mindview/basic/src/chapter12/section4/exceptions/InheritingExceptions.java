package chapter12.section4.exceptions;

/**
 * Creating your own exceptions
 *
 * @author zhanghua
 * @date 2020/10/9
 */
public class InheritingExceptions {
    public void f() throws SimpleException {
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions sed = new InheritingExceptions();
        try {
            sed.f();
        } catch (SimpleException e) {
            System.out.println("Caught it!");
        }
    }
    /* Output:
    Throw SimpleException from f()
    Caught it!
     */
}

class SimpleException extends Exception {
}
