package chapter10.section8.innerclasses;

/**
 * Two ways that a class can implement multiple interfaces
 *
 * @author zhanghua
 * @date 2020/9/18
 */
public class MultiInterfaces {
    static void takesA(A a) {

    }

    static void takesB(B b) {

    }

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesA(y);
        takesB(x);
        takesB(y.makeB());
    }
}

interface A {
}

interface B {
}

class X implements A, B {
}

class Y implements A {
    // Anonymous inner class
    B makeB() {
        return new B() {
        };
    }
}