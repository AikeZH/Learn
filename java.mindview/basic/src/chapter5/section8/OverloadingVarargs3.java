package chapter5.section8;

/**
 * initialization/OverloadingVararg3.java
 * @author zhanghua
 * @date 2020/7/22
 */
public class OverloadingVarargs3 {
    static void f(float i, Character... args){
        System.out.println("first");
    }
    static void f(char c, Character... args){
        System.out.println("second");
    }

    public static void main(String[] args) {
        f(1,'a');
        f('a','b');
    }
    /* Output:
    first
    second
     */
}
