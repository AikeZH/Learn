package chapter14.section2.typeinfo;

/**
 * @author zhanghua
 * @date 2020/10/23
 */
public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        // Same thing
        genericIntClass = Integer.class;
        intClass = double.class;
        // Illegal
        // genericIntClass = double.class;
    }
}
