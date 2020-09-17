package chapter10.section7.innerclasses;

/**
 * Nested classes can access all member of all levels of the classes they are nested within
 * @author zhanghua
 * @date 2020/9/17
 */
public class MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
    }
}
class MNA{
    private void f() {
    }
    class A{
        private void g() {

        }
        public class B{
            void h(){
                g();
                f();
            }
        }
    }
}
