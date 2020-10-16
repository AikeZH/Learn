package chapter13.section1.strings;

/**
 * @author zhanghua
 * @date 2020/10/15
 */
public class Immutable {
    public static String upcase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "howdy";
        // howdy
        System.out.println(q);
        String qq = upcase(q);
        // HOWDY
        System.out.println(qq);
        // howdy
        System.out.println(q);
    }
    /* Output:
    howdy
    HOWDY
    howdy
     */
}
