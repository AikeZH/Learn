package chapter12.section4.exceptions;

/**
 * @author zhanghua
 * @date 2020/10/9
 */
public class FullConstructors {
    public static void f() throws MyException{
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }
    public static void g() throws MyException{
        System.out.println("Throwing MyException from g()");
        throw new MyException("Originated in g()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }

        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
    }
    /*
    Throwing MyException from f()
    chapter12.section4.exceptions.MyException
        at chapter12.section4.exceptions.FullConstructors.f(FullConstructors.java:10)
        at chapter12.section4.exceptions.FullConstructors.main(FullConstructors.java:19)
    Throwing MyException from g()
    chapter12.section4.exceptions.MyException: Originated in g()
        at chapter12.section4.exceptions.FullConstructors.g(FullConstructors.java:14)
        at chapter12.section4.exceptions.FullConstructors.main(FullConstructors.java:25)
     */
}
class MyException extends Exception{
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}