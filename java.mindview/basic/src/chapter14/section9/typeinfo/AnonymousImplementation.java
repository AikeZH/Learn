package chapter14.section9.typeinfo;

import chapter14.section9.typeinfo.interfacea.A;

/**
 * Anonymous inner classes can't hide from reflection
 * @author zhanghua
 * @date 2020/11/6
 */
public class AnonymousImplementation {
    public static void main(String[] args) throws Exception {
        A a = new AnonymousA().makeA();
        a.f();
        System.out.println(a.getClass().getName());
        // Reflection still gets into the anonymous class
        HiddenImplementation.callHiddenMethod(a, "g");
        HiddenImplementation.callHiddenMethod(a, "u");
        HiddenImplementation.callHiddenMethod(a, "v");
        HiddenImplementation.callHiddenMethod(a, "w");
    }
    /* Output:
    public anonymous f()
    chapter14.section9.typeinfo.AnonymousA$1
    public anonymous g()
    package anonymous u()
    protected anonymous v()
    private anonymous w()
     */
}

class AnonymousA{
    public static A makeA() {
        return new A() {
            @Override
            public void f() {
                System.out.println("public anonymous f()");
            }

            public void g() {
                System.out.println("public anonymous g()");
            }

            void u() {
                System.out.println("package anonymous u()");
            }

            protected void v() {
                System.out.println("protected anonymous v()");
            }

            private void w() {
                System.out.println("private anonymous w()");
            }
        };
    }
}
