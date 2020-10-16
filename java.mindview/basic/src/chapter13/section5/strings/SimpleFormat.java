package chapter13.section5.strings;

/**
 * @author zhanghua
 * @date 2020/10/16
 */
public class SimpleFormat {
    public static void main(String[] args) {
        int x = 5;
        double y = 5.332542;
        // The old way:
        System.out.println("Row 1: [" + x + " " + y + "]");
        // The new way:
        System.out.format("Row 1: [%d %f]\n", x, y);
        // or
        System.out.printf("Row 1: [%d %f]\n", x, y);
    }
    /* Output:
    Row 1: [5 5.332542]
    Row 1: [5 5.332542]
    Row 1: [5 5.332542]
     */
}
