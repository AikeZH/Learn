package chapter11.section7.holding;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * TODO
 *
 * @author zhanghua
 * @date 2020/9/24
 */
public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("a", "b", "c", "d", "e"));
        System.out.println(list);
        // Identical
        System.out.println("pets.getFirst(): " + list.getFirst());
        System.out.println("pets.element(): " + list.element());
        // Only differs in empty-list behavior
        System.out.println("pets.peek(): " + list.peek());
        System.out.println(list);
        // Identical; remove and return the first element
        System.out.println("pets.remove(): " + list.remove());
        System.out.println("pets.removeFirst(): " + list.removeFirst());
        // Only differs in empty-list behavior
        System.out.println("pets.poll(): " + list.poll());
        System.out.println(list);
        list.addFirst("A");
        System.out.println("After addFirst(): " + list);
        list.offer("E");
        System.out.println("After offer(): " + list);
        list.add("F");
        System.out.println("After add(): "+list);
        list.addLast("G");
        System.out.println("After addLast(): "+list);
        System.out.println("pets.removeLast(): "+list.removeLast());
    }
}
