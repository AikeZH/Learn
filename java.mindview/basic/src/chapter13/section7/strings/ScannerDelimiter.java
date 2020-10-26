package chapter13.section7.strings;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author zhanghua
 * @date 2020/10/21
 */
public class ScannerDelimiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("12, 42, 78, 99, 44");
        scanner.useDelimiter("\\s*,\\s*");
        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        }
    }
    /* Output:
    12
    42
    78
    99
    44
     */
}
