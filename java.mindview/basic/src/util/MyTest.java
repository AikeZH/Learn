package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhanghua
 * @date 2020/9/25
 */
public class MyTest {

    public static void main(String[] args) {
        String s = "/ abc:123,cde=234/";
        Pattern p = Pattern.compile("(\\w+)((:|=)(\\d+))");
        Matcher m = p.matcher(s);
        while (m.find()) {
            for (int i = 0; i <= m.groupCount(); i++) {
                System.out.println("gouup("+i+"):"+m.group(i));
            }
        }
    }
}
