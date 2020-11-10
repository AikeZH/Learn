package chapter15.section7.generics;

/**
 * @author zhanghua
 * @date 2020/11/10
 */
public class Manipulation {
    public static void main(String[] args) {
        HasF hf = new HasF();
        Manipulator<HasF> manipulator = new Manipulator<>(hf);
        manipulator.manipulate();
    }
}

class Manipulator<T>{
    private T obj;

    public Manipulator(T x) {
        obj = x;
    }

    // Error: cannot find symbol: method f()
    public void manipulate() {
        // obj.f();
    }
}