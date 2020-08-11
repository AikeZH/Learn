package chapter7.section1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhanghua
 * @date 2020/8/3
 */
public class T {
    public static void main(String[] args) {
        int total = 10000000;
        long start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            T1 t2 = new T1(i);
        }
        System.out.println("More declare cast time: " + (System.currentTimeMillis() - start));
        /*
        180 137 179 149 156
         */

//        T1 t;
//        for (int i = 0; i < total; i++) {
//            t = new T1(i);
//        }
//        System.out.println("Once declare cast time: " + (System.currentTimeMillis() - start));

    }
}

class T1 {
    private String name;
    private List<String> list;
    private Map<String, Object> map;

    T1(int i) {
        name = "name" + i;
        list = new ArrayList<>();
        map = new HashMap<>();
    }
}
