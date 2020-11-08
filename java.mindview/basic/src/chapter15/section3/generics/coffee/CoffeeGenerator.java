package chapter15.section3.generics.coffee;

import util.Generator;

import java.util.Iterator;
import java.util.Random;

/**
 * Generate different types of Coffee
 *
 * @author ZhangHua
 * @date 2020/11/7
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
    private Class[] types = {Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class};
    private static Random random = new Random(47);

    public CoffeeGenerator() {
    }

    // For iteration
    private int size = 0;

    public CoffeeGenerator(int size) {
        this.size = size;
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
            // Report programmer errors at run time
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;

        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        @Override
        public void remove() {
            // Not implemented
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        CoffeeGenerator gen = new CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
        for (Coffee coffee : new CoffeeGenerator(5)) {
            System.out.println(coffee);
        }
    }
    /*
    Americano 0
    Latte 1
    Americano 2
    Mocha 3
    Mocha 4
    Breve 5
    Americano 6
    Latte 7
    Cappuccino 8
    Cappuccino 9
     */
}
