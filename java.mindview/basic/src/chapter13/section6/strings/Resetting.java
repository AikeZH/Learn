package chapter13.section6.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhanghua
 * @date 2020/10/21
 */
public class Resetting {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("[frb][aiu][gx]").matcher("fix the rug with bags");
        while (m.find()) {
            System.out.print(m.group() + " ");
        }
        System.out.println();
        m.reset("fix the rig with rags");
        while (m.find()) {
            System.out.print(m.group() + " ");
        }
    }
    /* Output:
    fix rug bag
    fix rig rag
     */
}
