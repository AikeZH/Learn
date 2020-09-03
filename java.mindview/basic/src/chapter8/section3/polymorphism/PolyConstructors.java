package chapter8.section3.polymorphism;

/**
 * Constructors and polymorphism
 *
 * @author zhanghua
 * @date 2020/9/3
 */
public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
    /*
    Glyph() before draw()
    RoundGlyph.draw(),radius = 0
    Glyph() after draw()
    RoundGlyph.RoundGlyph(),radius = 5
     */
}

class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }

    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int r) {
        this.radius = r;
        System.out.println("RoundGlyph.RoundGlyph(),radius = " + radius);
    }

    void draw() {
        System.out.println("RoundGlyph.draw(),radius = "+radius);
    }
}
