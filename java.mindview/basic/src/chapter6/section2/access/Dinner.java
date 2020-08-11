package chapter6.section2.access;

import chapter6.section2.access.dessert.Cookie;

/**
 * access.Dinner.java
 * Use the library
 * @author zhanghua
 * @date 2020/7/27
 */
public class Dinner {
    public static void main(String[] args) {
        Cookie x = new Cookie();
        //! x.bite(); // Can't access
    }
    /* Output:
    Cookie constructor
     */
}
