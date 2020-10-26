package chapter14.section2.typeinfo;

/**
 * @author zhanghua
 * @date 2020/10/23
 */
public class WildcardClassReferences {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = Integer.class;
    }
}
