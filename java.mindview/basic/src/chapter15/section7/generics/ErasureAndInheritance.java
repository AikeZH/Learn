package chapter15.section7.generics;

/**
 * @author zhanghua
 * @date 2020/11/10
 */
public class ErasureAndInheritance {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Derived2 d2 = new Derived2();
        Object obj = d2.get();
        // Warning here!
        d2.set(obj);
    }
}
class GenericBase<T>{
    private T element;

    public void set(T arg) {
        arg = element;
    }

    public T get() {
        return element;
    }
}

class Derived1<T> extends GenericBase<T>{}

// No warning
class Derived2 extends GenericBase{}

// class Derived3 extends GenericBase<?>{}
// Strange error:
//      unexpected type found : ?
//      required: class or interface without bounds
