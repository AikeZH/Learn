package chapter5.section8;

/**
 * initialization/VarargType.java
 *
 * @author zhanghua
 * @date 2020/7/22
 */
public class VarargType {
    static void f(Character... args) {
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }

    static void g(int... args) {
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }

    public static void main(String[] args) {
        f('a');
        f();
        g(1);
        g();
        System.out.println("int[]: " + new int[0].getClass());
        System.out.println("char[]: " + new char[0].getClass());
        System.out.println("byte[]: " + new byte[0].getClass());
        System.out.println("short[]: " + new short[0].getClass());
        System.out.println("float[]: " + new float[0].getClass());
        System.out.println("long[]: " + new long[0].getClass());
        System.out.println("double[]: " + new double[0].getClass());
        System.out.println("String[]: " + new String[0].getClass());
    }
    /* Output:
    class [Ljava.lang.Character; length 1
    class [Ljava.lang.Character; length 0
    class [I length 1
    class [I length 0
    int[]: class [I
     */
}
