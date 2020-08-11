package chapter6.section2.access;

/**
 * access.IceCream.java
 * Demonstrates "private" keyword
 * @author zhanghua
 * @date 2020/7/31
 */
public class IceCream {
    public static void main(String[] args) {
        //! Sundae x = new Sundae();
        Sundae x = Sundae.makeASundae();
    }
}

class Sundae{
    private Sundae(){}

    static Sundae makeASundae(){
        return new Sundae();
    }
}
