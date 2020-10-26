package chapter13.section6.strings;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @author zhanghua
 * @date 2020/10/21
 */
public class SplitDemo {
    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input)));
        // Only do the first three
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input, 3)));
    }
    /* Output:
    [This, unusual use, of exclamation, points]
    [This, unusual use, of exclamation!!points]
     */
}
