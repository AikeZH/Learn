package chapter8.section2.polymorphism;

/**
 * Trying to override a private method
 *
 * @author zhanghua
 * @date 2020/9/1
 */
public class PrivateOverride {
    private void f(){
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
    /* Output:
    private f()
     */
}

class Derived extends PrivateOverride{
    public void f(){
        System.out.println("public f()");
    }
}