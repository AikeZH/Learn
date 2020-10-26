package chapter14.section2.typeinfo.toys;

/**
 * Testing class Class
 * @author zhanghua
 * @date 2020/10/23
 */
public class GenericToyTest {
    public static void main(String[] args) throws Exception {
        Class<FancyToy> ftClass = FancyToy.class;
        // Produces exact type
        FancyToy fancyToy = ftClass.newInstance();
        Class<? super FancyToy> up = ftClass.getSuperclass();
        // This won't compile
        // Class<Toy> up2 = ftClass.getSuperclass();
        // Only produces Object
        Object obj = up.newInstance();
    }
}
