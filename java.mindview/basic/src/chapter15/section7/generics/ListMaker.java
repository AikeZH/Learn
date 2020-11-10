package chapter15.section7.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanghua
 * @date 2020/11/10
 */
public class ListMaker<T> {
    List<T> create() {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        ListMaker<String> stringMaker = new ListMaker<>();
        List<String> stringList = stringMaker.create();
    }
}
