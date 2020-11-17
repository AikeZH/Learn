package chapter16.section5.arrays;

import java.security.PublicKey;

/**
 * Arrays of generic types won't compile
 * @author ZhangHua
 * @date 2020/11/16
 */
public class ArrayOfGenericType<T> {
    // OK
    T[] array;

    @SuppressWarnings("unchecked")
    public ArrayOfGenericType(int size) {
        // Illegal
        //! array = new T[size];
        // "unchecked" Warning
        array = (T[]) new Object[size];
    }

    // Illegal
    //! public <U> U[] makeArray() { return new U[10]; }
}
