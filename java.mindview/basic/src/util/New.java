package util;

import chapter7.section1.T;

import java.util.*;

/**
 * Utilities to simplify generic container creation by using type argument interface
 *
 * @author ZhangHua
 * @date 2020/11/8
 */
public class New {
    public static <K, V> Map<K, V> map() {
        return new HashMap<>();
    }

    public static <T> List<T> list() {
        return new ArrayList<>();
    }

    public static <T> LinkedList<T> lList(){
        return new LinkedList<>();
    }

    public static <T> Set<T> set() {
        return new HashSet<>();
    }

    public static <T> Queue<T> queue() {
        return new LinkedList<>();
    }

    // Examples
    public static void main(String[] args) {
        Map<String, List<String>> map = New.map();
        List<String> ls = New.list();
        LinkedList<String> lls = New.lList();
        Set<String> ss = New.set();
        Queue<String> qs = New.queue();
    }
}
