package chapter15.section10.generics;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhanghua
 * @date 2020/11/11
 */
public class ComplilerIntelligence {
    public static void main(String[] args) {
        List<? extends Fruit> flist = Arrays.asList(new Apple());
        // No warning
        Apple a = (Apple) flist.get(0);
        // Argument is 'Object'
        flist.contains(new Apple());
        flist.indexOf(new Apple());
    }
}
