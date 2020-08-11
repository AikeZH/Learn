package chapter6.section2.access;

import chapter6.section2.access.dessert.Cookie;

/**
 * access.ChocolateChip.java
 * Can't use package-access member from another package.
 * @author zhanghua
 * @date 2020/7/31
 */
public class ChocolateChip extends Cookie {
    public ChocolateChip(){
        System.out.println("ChocolateChip constructor");
    }
    public void chomp(){
        //! bite(); // Can't access bite
    }

    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
    /* Output:
    Cookie constructor
    ChocolateChip constructor
     */
}
