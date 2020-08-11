package chapter5.section9;

/**
 * initialization/EnumOrder.java
 * @author zhanghua
 * @date 2020/7/22
 */
public class EnumOrder {
    public static void main(String[] args) {
        for (Spiciness s : Spiciness.values()) {
            System.out.println(s + ", ordinal "+s.ordinal());
        }
    }
    /* Output:
    NOT, ordinal 0
    MILD, ordinal 1
    MEDIUM, ordinal 2
    HOT, ordinal 3
    FLAMING, ordinal 4
     */
}
