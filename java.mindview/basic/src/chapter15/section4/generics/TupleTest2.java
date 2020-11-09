package chapter15.section4.generics;

import chapter15.Amphibian;
import chapter15.Vehicle;
import util.*;

/**
 * @author ZhangHua
 * @date 2020/11/8
 */
public class TupleTest2 {
    static TwoTuple<String, Integer> f() {
        return Tuple.tuple("hi", 47);
    }

    static TwoTuple f2() {
        return Tuple.tuple("hi", 47);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return Tuple.tuple(new Amphibian(), "hi", 47);
    }

    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return Tuple.tuple(new Vehicle(), new Amphibian(), "hi", 47);
    }

    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
        return Tuple.tuple(new Vehicle(), new Amphibian(), "hi", 47, 11.1);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(f2());
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
    /* Output:
    (hi, 47)
    (hi, 47)
    (chapter15.section4.generics.Amphibian@19e1023e, hi, 47)
    (chapter15.section4.generics.Vehicle@2db0f6b2, chapter15.section4.generics.Amphibian@3cd1f1c8, hi, 47)
    (chapter15.section4.generics.Vehicle@1996cd68, chapter15.section4.generics.Amphibian@3339ad8e, hi, 47, 11.1)
     */
}
