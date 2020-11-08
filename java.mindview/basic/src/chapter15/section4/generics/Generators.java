package chapter15.section4.generics;

import chapter15.section3.generics.Fibonacci;
import chapter15.section3.generics.coffee.Coffee;
import chapter15.section3.generics.coffee.CoffeeGenerator;
import util.Generator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * A utility to use with Generators
 *
 * @author ZhangHua
 * @date 2020/11/8
 */
public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffee = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
        for (Coffee c : coffee) {
            System.out.println(c);
        }
        Collection<Integer> fnumbers = fill(new ArrayList<Integer>(), new Fibonacci(), 12);
        for (Integer i : fnumbers) {
            System.out.print(i + ", ");
        }
    }
    /* Output:
    Americano 0
    Latte 1
    Americano 2
    Mocha 3
    1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
     */
}
