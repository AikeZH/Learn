package chapter15.section8.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanghua
 * @date 2020/11/10
 */
public class ListOfGenerics<T> {
    private List<T> array = new ArrayList<>();

    public void add(T item) {
        array.add(item);
    }

    public T get(int index) {
        return array.get(index);
    }
}
