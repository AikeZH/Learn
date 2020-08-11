package chapter5.section8;

/**
 * initialization/OverloadingVarargs2.java
 * {CompileTimeError}(Won't compile)
 * @author zhanghua
 * @date 2020/7/22
 */
public class OverloadingVarargs2 {
    static void f(float i, Character... args){
        System.out.println("first");
    }
    static void f(Character... args){
        System.out.println("second");
    }

    public static void main(String[] args) {
//        f(1,'a');
//        f('a','b');
    }
    /* CompileTimeError:
    Error:(19, 9) java: 对f的引用不明确
    chapter5.section8.OverloadingVarargs2 中的方法 f(float,java.lang.Character...)
    和 chapter5.section8.OverloadingVarargs2 中的方法 f(java.lang.Character...) 都匹配
     */
}
