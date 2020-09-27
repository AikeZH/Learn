package chapter11.section12.holding;

import chapter14.section3.typeinfo.pets.Pet;

import java.util.Iterator;

/**
 * TODO
 * @author zhanghua
 * @date 2020/9/27
 */
public class InterfaceIterator {
    public static void display(Iterator<Pet> it) {
        while (it.hasNext()){
            Pet p = it.next();
//            System.out.println(p.id);
        }
    }
}
