package chapter14.section2.typeinfo;

/**
 * @author zhanghua
 * @date 2020/10/23
 */
public class BoundedClassReferences {
    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
        // Or anything else derived from Number
    }
}
