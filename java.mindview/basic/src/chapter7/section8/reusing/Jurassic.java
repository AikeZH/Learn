package chapter7.section8.reusing;

/**
 * reusing.Jurassic.java
 * Making an entire class final
 *
 * @author zhanghua
 * @date 2020/8/26
 */
public class Jurassic {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j++;
    }
}

class SmallBrian {
}

final class Dinosaur {
    int i = 7;
    int j = 1;
    SmallBrian x = new SmallBrian();

    void f() {
    }
}
//error: Cannot extend final class 'Dinosaur'
//! class Further extends Dinosaur{}