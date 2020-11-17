package chapter15.section10.generics;

/**
 * @author zhanghua
 * @date 2020/11/11
 */
public class Holder<T> {
    private T value;

    public Holder() {
    }

    public Holder(T value) {
        this.value = value;
    }

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> apple = new Holder<>(new Apple());
        Apple d = apple.get();
        apple.set(d);
        // Cannot upcast
        // Holder<Fruit> fruit = apple;
        // OK
        Holder<? extends Fruit> fruit = apple;
        Fruit p = fruit.get();
        // Returns 'Object'
        d = (Apple)fruit.get();
        try {
            Orange c = (Orange)fruit.get();
        } catch (Exception e) {
            System.out.println(e);
        }
        // Cannot call set()
        // fruit.set(new Apple());
        // fruit.set(new Fruit());
        System.out.println(fruit.equals(d));
    }
    /* Output:
    java.lang.ClassCastException: chapter15.section10.generics.Apple cannot be cast to chapter15.section10.generics.Orange
    true
     */
}
