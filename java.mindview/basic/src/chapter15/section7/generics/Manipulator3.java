package chapter15.section7.generics;

/**
 * @author zhanghua
 * @date 2020/11/10
 */
public class Manipulator3 {
    private HasF obj;

    public Manipulator3(HasF x) {
        obj = x;
    }

    public void manipulate() {
        obj.f();
    }
}
