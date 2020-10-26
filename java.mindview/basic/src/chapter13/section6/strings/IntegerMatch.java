package chapter13.section6.strings;

/**
 * @author zhanghua
 * @date 2020/10/19
 */
public class IntegerMatch {
    public static void main(String[] args) {
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("5678".matches("-?\\d+"));
        System.out.println("+911".matches("-?\\d+"));
        System.out.println("+911".matches("(-|\\+)?\\d+"));
    }
    /* Output:
    true
    true
    false
    true
     */
}
