package chapter10.section3.innerclasses;

/**
 * Qualifying access to the outer-class object
 * @author zhanghua
 * @date 2020/9/15
 */
public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }

    public class Inner {
        public DotThis outer() {
            // A plain "this" would be Inner's "this"
            return DotThis.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
    /* Output:
    DotThis.f()
     */
}
