package chapter14.section9.typeinfo;

import chapter14.section9.typeinfo.interfacea.A;
import chapter14.section9.typeinfo.packageaccess.HiddenC;

import java.lang.reflect.Method;

/**
 * Sneaking around package access
 *
 * @author zhanghua
 * @date 2020/11/6
 */
public class HiddenImplementation {
    public static void main(String[] args) throws Exception {
        A a = HiddenC.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        // Compile error: cannot find symbol 'C'
        /*
        if (a instanceof chapter9.section8.interfaces.nesting.A.C){
            C c = (chapter9.section8.interfaces.nesting.A.C)a;
            c.g();
        }
        */
        // Oops! Reflection still allows us to call g()
        callHiddenMethod(a, "g");
        // And even methods that are less accessible!
        callHiddenMethod(a, "u");
        callHiddenMethod(a, "v");
        callHiddenMethod(a, "w");
    }
    /* Output:
    public C.f()
    chapter14.section9.typeinfo.packageaccess.C
    public C.g()
    package C.u()
    protected C.v()
    private C.w()
     */

    static void callHiddenMethod(Object a, String methodName) throws Exception {
        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }
}
