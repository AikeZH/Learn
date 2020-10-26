package chapter13.section6.strings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * TODO after chapter 18 IO
 * A very simple version of the "grep" program
 * {Args: JGrep.java "\b[Ssct]\w+"}
 *
 * @author zhanghua
 * @date 2020/10/21
 */
public class JGrep {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }
        Pattern p = Pattern.compile(args[1]);
        // Iterate through the lines of the input file
        int index = 0;
        Matcher m = p.matcher("");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Learn\\java.mindview\\basic\\src\\chapter13\\section6\\strings\\JGrep.java"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            m.reset(line);
            while (m.find()) {
                System.out.println(index++ + ":" + m.group() + ":" + m.start());
            }
        }
    }
    /* Output:
     */
}
