package chapter15.section3.generics.coffee;

/**
 * @author ZhangHua
 * @date 2020/11/7
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
