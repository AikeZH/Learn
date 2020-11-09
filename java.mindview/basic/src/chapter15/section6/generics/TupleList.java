package chapter15.section6.generics;

import chapter15.Amphibian;
import chapter15.Vehicle;
import chapter15.section2.generics.TupleTest;
import util.FourTuple;

import java.util.ArrayList;

/**
 * Combining generic types to make complex generic types
 *
 * @author ZhangHua
 * @date 2020/11/9
 */
public class TupleList<A, B, C, D> extends ArrayList<FourTuple<A, B, C, D>> {
    public static void main(String[] args) {
        TupleList<Vehicle, Amphibian,String,Integer> tl = new TupleList<>();
        tl.add(TupleTest.h());
        tl.add(TupleTest.h());
        for (FourTuple<Vehicle, Amphibian, String, Integer> i : tl) {
            System.out.println(i);
        }
    }
    /* Output:
    (chapter15.Vehicle@2db0f6b2, chapter15.Amphibian@3cd1f1c8, hi, 47)
    (chapter15.Vehicle@3a4afd8d, chapter15.Amphibian@1996cd68, hi, 47)
     */
}
