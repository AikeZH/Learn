package chapter12.section4.exceptions;

/**
 * Further embellishment of exception classes
 *
 * @author zhanghua
 * @date 2020/10/9
 */
public class ExtraFeatures {
    public static void f() throws MyException2 {
        System.out.println("Throwing MyException2 from f()");
        throw new MyException2();
    }

    public static void g() throws MyException2 {
        System.out.println("Throwing MyException2 from g()");
        throw new MyException2("Originated in g()");
    }

    public static void h() throws MyException2 {
        System.out.println("Throwing MyException2 from h()");
        throw new MyException2("Originated in h()", 47);
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException2 e) {
            e.printStackTrace(System.out);
        }
        try {
            g();
        } catch (MyException2 e) {
            e.printStackTrace(System.out);
        }
        try {
            h();
        } catch (MyException2 e) {
            e.printStackTrace(System.out);
            System.out.println("e.val() = " + e.val());
        }
    }
    /* Output:
    Throwing MyException2 from f()
    chapter12.section4.exceptions.MyException2: Detail Message: 0 null
        at chapter12.section4.exceptions.ExtraFeatures.f(ExtraFeatures.java:12)
        at chapter12.section4.exceptions.ExtraFeatures.main(ExtraFeatures.java:27)
    Throwing MyException2 from g()
    chapter12.section4.exceptions.MyException2: Detail Message: 0 Originated in g()
        at chapter12.section4.exceptions.ExtraFeatures.g(ExtraFeatures.java:17)
        at chapter12.section4.exceptions.ExtraFeatures.main(ExtraFeatures.java:32)
    Throwing MyException2 from h()
    chapter12.section4.exceptions.MyException2: Detail Message: 47 Originated in h()
        at chapter12.section4.exceptions.ExtraFeatures.h(ExtraFeatures.java:22)
        at chapter12.section4.exceptions.ExtraFeatures.main(ExtraFeatures.java:37)
    e.val() = 47
     */
}

class MyException2 extends Exception {
    private int x;

    public MyException2() {
    }

    public MyException2(String message) {
        super(message);
    }

    public MyException2(String message, int x) {
        super(message);
        this.x = x;
    }

    public int val() {
        return x;
    }

    @Override
    public String getMessage() {
        return "Detail Message: " + x + " " + super.getMessage();
    }
}