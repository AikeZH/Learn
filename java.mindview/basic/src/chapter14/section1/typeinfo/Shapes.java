package chapter14.section1.typeinfo;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhanghua
 * @date 2020/10/22
 */
public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
        for (Shape shape : shapeList) {
            shape.draw();
        }
    }
    /* Output:
    Circle.draw()
    Square.draw()
    Triangle.draw()
     */
}

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    @Override
    abstract public String toString();
}

class Circle extends Shape {
    @Override
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    @Override
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    @Override
    public String toString() {
        return "Triangle";
    }
}