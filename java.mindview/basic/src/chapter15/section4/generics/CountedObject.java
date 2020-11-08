package chapter15.section4.generics;

/**
 * @author ZhangHua
 * @date 2020/11/8
 */
public class CountedObject {
    private static long counter = 0;
    private final long id = counter++;

    public long id() {
        return id;
    }

    @Override
    public String toString() {
        return "CountedObject " + id;
    }
}
