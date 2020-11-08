package chapter15.section3.generics;

import java.util.Iterator;

/**
 * Adapt the Fibonacci class to make it Iterable
 *
 * @author ZhangHua
 * @date 2020/11/8
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
    private int n;

    public IterableFibonacci(int count) {
        this.n = count;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return IterableFibonacci.this.next();
            }

            @Override
            public void remove() {
                // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (Integer i : new IterableFibonacci(18)) {
            System.out.print(i + " ");
        }
    }
    /* Output:
    1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584
     */
}
