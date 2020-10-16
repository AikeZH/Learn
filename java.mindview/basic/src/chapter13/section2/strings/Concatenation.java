package chapter13.section2.strings;

/**
 * @author zhanghua
 * @date 2020/10/15
 */
public class Concatenation {
    public static void main(String[] args) {
        String mango = "mango";
        String s = "abc" + mango + "def" + 47;
        System.out.println(s);
    }
    /* Output:
    abcmangodef47
     */
}
