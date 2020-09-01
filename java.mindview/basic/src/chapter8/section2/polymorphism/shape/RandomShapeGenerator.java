package chapter8.section2.polymorphism.shape;

import java.util.Random;

/**
 * A "factory" that randomly creates shapes.
 *
 * @author zhanghua
 * @date 2020/8/31
 */
public class RandomShapeGenerator {
    private Random random = new Random(47);

    public Shape next() {
        switch (random.nextInt(3)) {
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
            default:
                return new Circle();
        }
    }
}
