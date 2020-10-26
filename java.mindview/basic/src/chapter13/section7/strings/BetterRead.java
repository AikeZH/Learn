package chapter13.section7.strings;

import java.util.Scanner;

/**
 * @author zhanghua
 * @date 2020/10/21
 */
public class BetterRead {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(SimpleRead.input);
        System.out.println("What is your name?");
        String name = stdin.nextLine();
        System.out.println(name);
        System.out.println("How old are you? What is your favorite double?");
        System.out.println("(input: <age> <double>)");
        int age = stdin.nextInt();
        double favorite = stdin.nextDouble();
        System.out.println(age);
        System.out.println(favorite);
        System.out.printf("Hi %s.\n", name);
        System.out.printf("In 5 years you will be %d.\n", age + 5);
        System.out.printf("My favorite double is %f.", favorite/2);
    }
    /*
    What is your name?
    Sir Robin of Camelot
    How old are you? What is your favorite double?
    (input: <age> <double>)
    22
    1.61803
    Hi Sir Robin of Camelot.
    In 5 years you will be 27.
    My favorite double is 0.809015.
     */
}
