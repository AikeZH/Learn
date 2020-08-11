package chapter6.section2.access;

import chapter6.section2.access.dessert.Cookie2;

/**
 * access.Cake.java
 * Accesses a class in a separate
 * @author zhanghua
 * @date 2020/7/27
 */
public class Cake {
    public static void main(String[] args) {
        Pie x = new Pie();
        x.f();
    }
    /* Output:
    Pie.f()
     */
}
