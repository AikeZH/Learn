package chapter12.section6.exceptions;

/**
 * Rethrow a different object from the one that was caught
 * @author zhanghua
 * @date 2020/10/10
 */
public class RethrowNew {
    public static void f()throws OneException {
        System.out.println("originating the exception in f()");
        throw new OneException("thrown from f()");
    }

    public static void main(String[] args) {
        try {
            try {
                f();
            } catch (OneException e) {
                System.out.println("Caught in inner try, e.printStackTrace()");
                e.printStackTrace(System.out);
                throw new TwoException("from inner try");
            }
        } catch (TwoException e) {
            System.out.println("Caught in outer try, e.printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
    /* Output:
    originating the exception in f()
    Caught in inner try, e.printStackTrace()
    chapter12.section6.exceptions.OneException: thrown from f()
        at chapter12.section6.exceptions.RethrowNew.f(RethrowNew.java:11)
        at chapter12.section6.exceptions.RethrowNew.main(RethrowNew.java:17)
    Caught in outer try, e.printStackTrace()
    chapter12.section6.exceptions.TwoException: from inner try
        at chapter12.section6.exceptions.RethrowNew.main(RethrowNew.java:21)
     */
}

class OneException extends Exception {
    public OneException(String message) {
        super(message);
    }
}

class TwoException extends Exception {
    public TwoException(String message) {
        super(message);
    }
}
