package chapter9.section5.interfaces;

/**
 * @author zhanghua
 * @date 2020/9/9
 */
public class InterfaceCollision {
}

interface I1 {
    void f();
}

interface I2 {
    int f(int i);
}

interface I3 {
    int f();
}

class C {
    public int f() {
        return 1;
    }
}
class C2 implements I1, I2 {

    @Override
    public void f() {
    }

    @Override
    public int f(int i) {
        return 1;
    }
}

class C3 extends C implements I2 {

    @Override
    public int f(int i) {
        return 0;
    }
}

class C4 extends C implements I3 {
    // Identical, no problem
    public int f() {
        return 1;
    }
}

// Methods differ only by return type
//! class C5 extends C implements I1 {}
//! interface I4 extends I1, I3 {}