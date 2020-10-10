package chapter12.section7.exceptions;

/**
 * Ignoring RuntimeExceptions
 * {ThrowsException}
 * @author zhanghua
 * @date 2020/10/10
 */
public class NeverCaught {
    static void f() {
        throw new RuntimeException("From f()");
    }

    static void g() {
        f();
    }

    public static void main(String[] args) {
        g();
    }
    /* Output:
    Exception in thread "main" java.lang.RuntimeException: From f()
        at chapter12.section7.exceptions.NeverCaught.f(NeverCaught.java:11)
        at chapter12.section7.exceptions.NeverCaught.g(NeverCaught.java:15)
        at chapter12.section7.exceptions.NeverCaught.main(NeverCaught.java:19)
     */
}
