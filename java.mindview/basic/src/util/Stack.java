package util;

import java.util.LinkedList;

/**
 * Making a stack from a LinkedList.
 * @author zhanghua
 * @date 2020/9/24
 */
public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<>();

    public void push(T v) {
        storage.addFirst(v);
    }

    public T peek() {
        return storage.getFirst();
    }

    public T pop() {
        return storage.removeFirst();
    }

    public boolean empty(){
        return storage.isEmpty();
    }

    public String toString() {
        return storage.toString();
    }
}
