package chapter8.section2.polymorphism.shape;

/**
 * Polymorphism in Java
 * @author zhanghua
 * @date 2020/9/1
 */
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        // Fill up the array with shapes
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        // Make polymorphic method calls
        for (Shape shape : s) {
            shape.draw();
        }
    }
    /* Output:
    Triangle.draw()
    Triangle.draw()
    Square.draw()
    Triangle.draw()
    Square.draw()
    Triangle.draw()
    Square.draw()
    Triangle.draw()
    Circle.draw()
     */
}
