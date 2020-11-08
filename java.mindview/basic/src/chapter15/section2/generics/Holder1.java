package chapter15.section2.generics;

/**
 * @author zhanghua
 * @date 2020/11/6
 */
public class Holder1 {
    private Automobile a;

    public Holder1(Automobile a) {
        this.a = a;
    }

    Automobile get() {
        return a;
    }
}

class Automobile {
}
