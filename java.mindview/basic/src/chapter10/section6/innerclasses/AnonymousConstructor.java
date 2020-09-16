package chapter10.section6.innerclasses;

/**
 * Creating a constructor for an anonymous inner class
 *
 * @author zhanghua
 * @date 2020/9/16
 */
public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            {
                System.out.println("Inside instance initializer");
            }
            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
    /* Output:
    Base constructor, i = 47
    Inside instance initializer
    In anonymous f()
     */
}

abstract class Base {
    public Base(int i) {
        System.out.println("Base constructor, i = " + i);
    }
    public abstract void f();
}