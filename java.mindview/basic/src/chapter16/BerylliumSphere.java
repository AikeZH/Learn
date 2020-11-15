package chapter16;

/**
 * @author ZhangHua
 * @date 2020/11/15
 */
public class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Sphere " + id;
    }
}