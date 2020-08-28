package chapter7.section8.reusing;

/**
 * It only looks like you can override a private or private final method
 *
 * @author zhanghua
 * @date 2020/8/18
 */
public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        // You can up cast
        OverridingPrivate op = op2;
        // But you can't call the methods
        //! op.f();
        //! op.g();
        WithFinals wf = op2;
        //! wf.f();
        //! wf.g();
    }
    /* Output:
    OverridingPrivate2.f()
    OverridingPrivate2.g()
     */
}
class WithFinals{
    // Identical to "private" alone
    private final void f(){
        System.out.println("WithFinals.f()");
    }
    // Also automatically "final"
    private void g(){
        System.out.println("WithFinals.g()");
    }
}
class OverridingPrivate extends WithFinals{
    private final void f(){
        System.out.println("OverridingPrivate.f()");
    }
    private void g(){
        System.out.println();
    }
}
class OverridingPrivate2 extends OverridingPrivate{
    public final void f(){
        System.out.println("OverridingPrivate2.f()");
    }
    public void g(){
        System.out.println("OverridingPrivate2.g()");
    }
}