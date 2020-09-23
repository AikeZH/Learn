package chapter11.section5.holding;

import chapter14.section3.typeinfo.pets.Pet;

import java.util.*;

/**
 * TODO after Chapter14 do it
 * @author ZhangHua
 * @date 2020/9/23
 */
public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
//        List<Pet>
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("a", "b", "c", "d"));
        List<String> sub = list.subList(1, 3);
        List<String> copy = new ArrayList<>(list.subList(1, 3));
        System.out.println("list before:"+list);
        System.out.println("sub before:"+sub);
        System.out.println("copy before:"+copy);
        sub.add("e");
        System.out.println("list after:"+list);
        System.out.println("sub after:"+sub);
        System.out.println("copy after:"+copy);
        sub.set(1, "");
        LinkedList<Object> objects = new LinkedList<>();

    }
}
