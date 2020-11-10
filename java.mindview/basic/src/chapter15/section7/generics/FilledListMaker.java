package chapter15.section7.generics;

import chapter7.section1.T;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanghua
 * @date 2020/11/10
 */
public class FilledListMaker<T> {
    List<T> create(T t, int n) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(t);
        }
        return result;
    }

    public static void main(String[] args) {
        FilledListMaker<String> stringMaker = new FilledListMaker<>();
        List<String> list = stringMaker.create("Hello", 4);
        System.out.println(list);
    }
    /* Output:
    [Hello, Hello, Hello, Hello]
     */
}
