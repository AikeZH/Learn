package chapter19.section4.enumerated;

/**
 * @author zhanghua
 * @date 2021/1/15
 */
public class NonEnum {
    public static void main(String[] args) {
        Class<Integer> integerClass = Integer.class;
        try {
            for (Integer item : integerClass.getEnumConstants()) {
                System.out.println(item);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    /* Output:
    java.lang.NullPointerException
     */
}
