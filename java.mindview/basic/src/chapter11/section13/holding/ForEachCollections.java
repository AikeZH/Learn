package chapter11.section13.holding;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * @author zhanghua
 * @date 2020/9/29
 */
public class ForEachCollections {
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<>();
        Collections.addAll(cs, "Take the long way home".split(" "));
        for (String c : cs) {
            System.out.print("'" + c + "' ");
        }
    }
    /* Output:
    'Take' 'the' 'long' 'way' 'home'
     */
}
