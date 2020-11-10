package chapter15.section7.generics;

/**
 * @author zhanghua
 * @date 2020/11/10
 */
public class Manipulator2<T extends HasF> {
    private T obj;
    public Manipulator2(T x){
        obj = x;
    }

    public void manipulate() {
        obj.f();
    }
}
