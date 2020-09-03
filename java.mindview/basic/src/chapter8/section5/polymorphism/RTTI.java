package chapter8.section5.polymorphism;

/**
 * Downcasting & Runtime type information (RTTI)
 *
 * @author zhanghua
 * @date 2020/9/3
 */
public class RTTI {
    public static void main(String[] args) {
        Useful[] x ={
                new Useful(),
                new MoreUseful()
        };
        x[0].f();
        x[1].g();
        // Compile time: method not found in Useful
        //! x[1].u();
        ((MoreUseful)x[1]).u(); // Downcast/RTTI
        ((MoreUseful)x[0]).u(); // Exception thrown
    }
}

class Useful {
    public void f() {
    }

    public void g() {
    }
}

class MoreUseful extends Useful {
    @Override
    public void f() {
    }

    @Override
    public void g() {

    }

    public void u() {

    }

    public void v() {

    }

    public void w() {

    }
}