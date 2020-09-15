package chapter10.section3.innerclasses;

/**
 * Creating an inner class directly using the .new syntax
 * @author zhanghua
 * @date 2020/9/15
 */
public class DotNew {
    public class Inner {

    }

    public static void main(String[] args) {
        DotNew dotNew = new DotNew();
        DotNew.Inner dni = dotNew.new Inner();
    }
}
