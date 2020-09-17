package chapter10.section7.innerclasses;

/**
 * {main: ClassInterface$Test}
 * @author zhanghua
 * @date 2020/9/17
 */
public interface ClassInInterface {
    void howdy();
    class Test implements ClassInInterface{

        @Override
        public void howdy() {
            System.out.println("Howdy!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
        /* Output:
        Howdy!
         */
    }
}