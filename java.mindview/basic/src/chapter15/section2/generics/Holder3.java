package chapter15.section2.generics;

/**
 * @author zhanghua
 * @date 2020/11/6
 */
public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public static void main(String[] args) {
        Holder3<Automobile> h3 = new Holder3(new Automobile());
        // No cast needed
        Automobile a = h3.get();
        // Error
        // h3.set("Not an Automobile");
        // h3.set(1);
    }
}
