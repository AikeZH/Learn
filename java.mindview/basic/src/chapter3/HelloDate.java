package chapter3;

import util.Print;

import java.util.Date;

import static util.Print.print;


/**
 * @author zhanghua
 * @date 2020/7/13
 */
public class HelloDate {
    public static void main(String[] args) {
        print(1);

        System.out.println(new Print());
        System.out.println(new Date());
        System.out.println(new Test());

//        System.out.println(validateCardID());

    }
    static class Test{
        @Override
        public String toString() {
            return "Test toString()";
        }
    }

    private static int validateCardID() {
        return (12-(
                5 * 7
                        + 0 * 9
                        + 0 * 10
                        + 1 * 5
                        + 1 * 8
                        + 2 * 4
                        + 1 * 2
                        + 9 * 1
                        + 9 * 6
                        + 0 * 3
                        + 0 * 7
                        + 7 * 9
                        + 0 * 10
                        + 4 * 5
                        + 0 * 8
                        + 6 * 4
                        + 7 * 2) % 11)%12;
    }
}
