package chapter15.section7.generics;

/**
 * @author zhanghua
 * @date 2020/11/10
 */
public class ReturnGenericType<T extends HasF> {
    private T obj;

    public ReturnGenericType(T x) {
        obj = x;
    }

    public T get() {
        return obj;
    }
}
