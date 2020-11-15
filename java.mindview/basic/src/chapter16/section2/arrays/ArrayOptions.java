package chapter16.section2.arrays;

import chapter16.BerylliumSphere;

import java.util.Arrays;

/**
 * Initialization & re-assignment of arrays
 *
 * @author ZhangHua
 * @date 2020/11/15
 */
public class ArrayOptions {
    public static void main(String[] args) {
        // Arrays of objects
        // Local uninitialized variable
        BerylliumSphere[] a;
        BerylliumSphere[] b = new BerylliumSphere[5];

        // The references inside the array are automatically initialized to null
        System.out.println("b: " + Arrays.toString(b));
        BerylliumSphere[] c = new BerylliumSphere[4];
        for (int i = 0; i < c.length; i++) {
            // Can test for null reference
            if (c[i] == null) {
                c[i] = new BerylliumSphere();
            }
        }
        // Aggregate initialization
        BerylliumSphere[] d = {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};

        // Dynamic aggregate initialization
        // (Trailing comma is optional in both cases)
        a = new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere(),};
        System.out.println("a.length = " + a.length);
        System.out.println("b.length = " + b.length);
        System.out.println("c.length = " + c.length);
        System.out.println("d.length = " + d.length);
        a = d;
        System.out.println("a.length = " + a.length);

        // Arrays of primitives
        // Null reference
        int[] e;
        int[] f = new int[5];
        // The primitives inside the array are automatically initialized to zero
        System.out.println("f: " + Arrays.toString(f));
        int[] g = new int[4];
        for (int i = 0; i < g.length; i++) {
            g[i] = i * i;
        }
        int[] h = {11, 47, 93};
        // Compile error: variable e not initialized
        //! System.out.println("e.length = " + e.length);
        System.out.println("f.length = " + f.length);
        System.out.println("g.length = " + g.length);
        System.out.println("h.length = " + h.length);
        e = h;
        System.out.println("e.length = " + e.length);
        e = new int[]{1, 2};
        System.out.println("e.length = " + e.length);
    }
    /* Output:
    b: [null, null, null, null, null]
    a.length = 2
    b.length = 5
    c.length = 4
    d.length = 3
    a.length = 3
    f: [0, 0, 0, 0, 0]
    f.length = 5
    g.length = 4
    h.length = 3
    e.length = 3
    e.length = 2
     */
}
