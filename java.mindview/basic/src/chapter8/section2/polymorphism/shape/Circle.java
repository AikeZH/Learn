package chapter8.section2.polymorphism.shape;

/**
 * @author zhanghua
 * @date 2020/8/31
 */
public class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }
}
