package chapter15.section8.generics;

/**
 * @author ZhangHua
 * @date 2020/11/10
 */
public class ArrayOfGeneric {
    static final int SIZE = 100;
    static Generic<Integer>[] gia;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Compiles: produces ClassCastException
        //! gia = (Generic<Integer>[]) new Object[SIZE];
        // Runtime type is the raw (erased) type
        gia = (Generic<Integer>[]) new Generic[SIZE];
        System.out.println(gia.getClass().getSimpleName());
        gia[0] = new Generic<Integer>();
        // Compile-time error
        //! gia[1] = new Object();
        // Discovers type mismatch at compile time
        //! gia[2] = new Generic<Double>();
    }
    /* Output:
    Generic[]
     */
}
