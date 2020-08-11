package chapter2;

import java.io.PrintStream;
import java.util.Date;

/**
 * @author zhanghua
 * @date 2020/7/3
 */
public class HelloDate {
    public static void main(String[] args) {
        PrintStream printStream = System.out;
        System.out.println("Hello. it's :");
        System.out.println(new Date());
    }
}
