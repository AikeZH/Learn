package chapter12.section6.exceptions;

/**
 * Demonstrating fillInStackTrace()
 *
 * @author zhanghua
 * @date 2020/10/10
 */
public class Rethrowing {
    public static void f() throws Exception {
        System.out.println("originating the exception in f()");
        throw new Exception("thrown from f()");
    }

    public static void g() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Inside g(), e.printStackTrace()");
            e.printStackTrace(System.out);
            throw e;
        }
    }

    public static void h() throws Exception{
        try {
            f();
        } catch (Exception e) {
            System.out.println("Inside h(), e.printStackTrace()");
            e.printStackTrace(System.out);
            throw (Exception) e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            g();
        } catch (Exception e) {
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }
        try {
            h();
        } catch (Exception e) {
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
    /*
    originating the exception in f()
    Inside g(), e.printStackTrace()
    java.lang.Exception: thrown from f()
        at chapter12.section6.exceptions.Rethrowing.f(Rethrowing.java:12)
        at chapter12.section6.exceptions.Rethrowing.g(Rethrowing.java:17)
        at chapter12.section6.exceptions.Rethrowing.main(Rethrowing.java:37)
    main: printStackTrace()
    java.lang.Exception: thrown from f()
        at chapter12.section6.exceptions.Rethrowing.f(Rethrowing.java:12)
        at chapter12.section6.exceptions.Rethrowing.g(Rethrowing.java:17)
        at chapter12.section6.exceptions.Rethrowing.main(Rethrowing.java:37)
    originating the exception in f()
    Inside h(), e.printStackTrace()
    java.lang.Exception: thrown from f()
        at chapter12.section6.exceptions.Rethrowing.f(Rethrowing.java:12)
        at chapter12.section6.exceptions.Rethrowing.h(Rethrowing.java:27)
        at chapter12.section6.exceptions.Rethrowing.main(Rethrowing.java:43)
    main: printStackTrace()
    java.lang.Exception: thrown from f()
        at chapter12.section6.exceptions.Rethrowing.h(Rethrowing.java:31)
        at chapter12.section6.exceptions.Rethrowing.main(Rethrowing.java:43)
     */
}
