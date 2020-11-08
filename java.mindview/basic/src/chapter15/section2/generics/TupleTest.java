package chapter15.section2.generics;

import util.FiveTuple;
import util.FourTuple;
import util.ThreeTuple;
import util.TwoTuple;

/**
 * @author zhanghua
 * @date 2020/11/6
 */
public class TupleTest {
    static TwoTuple<String, Integer> f() {
        // Autoboxing converts the int to Integer
        return new TwoTuple<>("hi", 47);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return new ThreeTuple<>(new Amphibian(), "hi", 47);
    }

    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return new FourTuple<>(new Vehicle(), new Amphibian(), "hi", 47);
    }

    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
        return new FiveTuple<>(new Vehicle(), new Amphibian(), "hi", 47, 11.1);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        // Compile error: final
        // ttsi.first = "there";
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
    /* Output:
    (hi, 47)
    (chapter15.section2.generics.Amphibian@27ddd392, hi, 47)
    (chapter15.section2.generics.Vehicle@64b8f8f4, chapter15.section2.generics.Amphibian@2db0f6b2, hi, 47)
    (chapter15.section2.generics.Vehicle@3a4afd8d, chapter15.section2.generics.Amphibian@1996cd68, hi, 47, 11.1)
     */
}

class Amphibian {
}

class Vehicle {
}
