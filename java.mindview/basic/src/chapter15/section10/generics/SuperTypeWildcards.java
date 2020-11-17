package chapter15.section10.generics;

import java.util.List;

/**
 * @author zhanghua
 * @date 2020/11/11
 */
public class SuperTypeWildcards {
    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
        // Error
        // apples.add(new Fruit());
    }
}
