package chapter15.section4.generics;

import util.BasicGenerator;
import util.Generator;

/**
 * @author ZhangHua
 * @date 2020/11/8
 */
public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
    }
    /* Output:
    CountedObject 0
    CountedObject 1
    CountedObject 2
    CountedObject 3
    CountedObject 4
     */
}
