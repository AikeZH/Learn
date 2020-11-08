package chapter14.section9.typeinfo;

import chapter14.section9.typeinfo.interfacea.A;

/**
 * Sneaking around an interface
 * @author zhanghua
 * @date 2020/11/6
 */
public class InterfaceViolation {
    public static void main(String[] args) {
        A a = new B();
        a.f();
        // Compile error
        // a.g();
        System.out.println(a.getClass().getName());
        if (a instanceof B) {
            B b = (B)a;
            b.g();
        }
    }
    /* Output:
    chapter14.section9.typeinfo.interfacea.B
     */
}

class B implements A {
    @Override
    public void f() {
    }

    public void g() {
    }
}
