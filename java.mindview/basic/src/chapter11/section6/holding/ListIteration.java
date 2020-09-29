package chapter11.section6.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * TODO
 * @author zhanghua
 * @date 2020/9/24
 */
public class ListIteration {
    public static void main(String[] args) {
        List<String> pets = new ArrayList<>(Arrays.asList("A,B,C,D,E,F,G,H".split(",")));
        ListIterator<String> it = pets.listIterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        // Backwards
        while (it.hasPrevious()){
            System.out.print(it.previous()+" ");
        }
        System.out.println();
        System.out.println(pets);
        it = pets.listIterator(3);
        while (it.hasNext()){
            it.next();
            it.set("Z");
        }
        System.out.println(pets);
    }
}
