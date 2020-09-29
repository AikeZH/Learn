package chapter11.section12.holding;

import java.util.Collection;
import java.util.Iterator;

/**
 * TODO
 * @author zhanghua
 * @date 2020/9/27
 */
public class InterfaceVsIterator {
    public static void display(Iterator<String> it) {
        while (it.hasNext()){
            System.out.print(it.next()+" ");
//            System.out.println(p.id);
        }
        System.out.println();
    }
    public static void display(Collection<String> c){
        for (String s : c) {
            System.out.print(s+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
    }
}
