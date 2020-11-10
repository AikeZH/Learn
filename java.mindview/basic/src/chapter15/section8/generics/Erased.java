package chapter15.section8.generics;

/**
 * {CompileTimeError}(Won't compile)
 * @author zhanghua
 * @date 2020/11/10
 */
public class Erased<T> {
    private final int SIZE = 100;

    public static void f(Object arg) {
        // Error
        // if (arg instanceof T){}
        // T var = new T();
        // T[] array = new T[SIZE];

        // Unchecked warning
        // T[] array = (T)new Object[SIZE];
    }
}
