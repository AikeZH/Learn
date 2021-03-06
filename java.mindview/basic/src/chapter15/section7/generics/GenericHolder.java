package chapter15.section7.generics;

/**
 * @author zhanghua
 * @date 2020/11/10
 */
public class GenericHolder<T> {
    private T obj;

    public T get() {
        return obj;
    }

    public void set(T obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        GenericHolder<String> holder = new GenericHolder<>();
        holder.set("Item");
        String s = holder.get();
    }
}
