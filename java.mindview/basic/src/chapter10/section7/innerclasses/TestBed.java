package chapter10.section7.innerclasses;

/**
 * Putting test code in a nested class
 * {main: TestBed$Tester}
 * @author zhanghua
 * @date 2020/9/17
 */
public class TestBed {
    public void f() {
        System.out.println("f()");
    }
    public static class Tester{
        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
        }
        /* Output:
        f()
         */
    }
}
