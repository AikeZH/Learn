package util;


/**
 * TODO chapter18
 * @author zhanghua
 * @date 2020/10/19
 */
public class Hex {
    public static String format(byte[] data) {
        StringBuilder result = new StringBuilder();
        int n = 0;
        for (byte b : data) {
            if (n % 16 == 0) {
                result.append(String.format("%05X: ", n));
            }
            result.append(String.format("%02X ", b));
            n++;
            if (n % 16 == 0) {
                result.append("\n");
            }
        }
        result.append("\n");
        return result.toString();
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println(format("ABCDEFGHIJKLMNOPQRST".getBytes()));
        }
    }
}
