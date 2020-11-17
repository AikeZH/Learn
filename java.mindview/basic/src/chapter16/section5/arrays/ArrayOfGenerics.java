package chapter16.section5.arrays;

import chapter16.BerylliumSphere;

import java.util.ArrayList;
import java.util.List;

/**
 * It is possible to create arrays of generics
 *
 * @author ZhangHua
 * @date 2020/11/16
 */
public class ArrayOfGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<String>[] ls;
        List[] la = new List[10];
        // "Unchecked" warning
        ls = (List<String>[]) la;
        ls[0] = new ArrayList<String>();
        // Compile-time checking produces an error
        //! ls[1] = new ArrayList<Integer>();

        // The problem: List<String> is a subtype of Object
        // So assignment is OK
        Object[] objects = ls;
        // Compiles and runs without complaint
        objects[1] = new ArrayList<Integer>();

        // However, if your needs are straightforward it is possible to create
        // an array of generics, albeit with an "unchecked" warning
        List<BerylliumSphere>[] spheres = (List<BerylliumSphere>[])new List[10];
        for (int i = 0; i < spheres.length; i++) {
            spheres[i] = new ArrayList<BerylliumSphere>();
        }
    }
}
