package chapter6.section2.access;

import chapter6.section2.access.dessert.Cookie2;

/**
 * access.ChocolateChip2.java
 * @author zhanghua
 * @date 2020/7/31
 */
public class ChocolateChip2 extends Cookie2 {
    public ChocolateChip2(){
        System.out.println("ChocolateChip2 constructor");
    }
    public void chomp(){
        bite(); // protected method
    }

    public static void main(String[] args) {
        ChocolateChip2 x = new ChocolateChip2();
        x.chomp();
    }
    /* Output:
    Cookie2 constructor
    ChocolateChip2 constructor
    bite
     */
}
