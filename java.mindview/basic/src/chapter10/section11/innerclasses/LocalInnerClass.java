package chapter10.section11.innerclasses;

/**
 * Holds a sequence of Objects.
 *
 * @author ZhangHua
 * @date 2020/9/22
 */
public class LocalInnerClass {
    private int count = 0;

    Counter getCounter(String name) {
        // A local inner class:
        class LocalCounter implements Counter {
            public LocalCounter() {
                // Local inner class can have a constructor
                System.out.println("LocalCounter()");
            }

            @Override
            public int next() {
                System.out.print(name); // Access local final
                return count++;
            }
        }
        return new LocalCounter();
    }

    // The same thing with an anonymous inner class
    Counter getCounter2(String name) {
        return new Counter() {
            // Anonymous inner class cannot have a named constructor, only an instance initializer
            {
                System.out.println("Counter()");
            }
            @Override
            public int next() {
                System.out.print(name); // Access local final
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter c1 = lic.getCounter("Local inner "),
                c2 = lic.getCounter2("Anonymous inner ");
        for (int i = 0; i < 5; i++) {
            System.out.println(c1.next());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(c2.next());
        }
    }
    /* Output:
    LocalCounter()
    Counter()
    Local inner 0
    Local inner 1
    Local inner 2
    Local inner 3
    Local inner 4
    Anonymous inner 5
    Anonymous inner 6
    Anonymous inner 7
    Anonymous inner 8
    Anonymous inner 9
     */
}

interface Counter {
    int next();
}
