package chapter10.section9.innerclasses;

/**
 * Inheriting an inner class
 *
 * @author ZhangHua
 * @date 2020/9/21
 */
public class InheritInner extends WithInner.Inner {
    // Won't compile
    //! InheritInner(){}
    InheritInner(WithInner wi) {
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}

class WithInner {
    class Inner {
    }
}