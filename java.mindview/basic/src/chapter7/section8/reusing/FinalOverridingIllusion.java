package chapter7.section8.reusing;

/**
 * It only looks like you can override a private or private final method
 *
 * @author zhanghua
 * @date 2020/8/18
 */
public class FinalOverridingIllusion {

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