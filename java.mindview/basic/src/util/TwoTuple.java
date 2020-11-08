package util;

/**
 * @author zhanghua
 * @date 2020/11/6
 */
public class TwoTuple<A, B> {
    public final A first;

    public final B second;

    public TwoTuple(A a, B b) {
        this.first = a;
        this.second = b;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
