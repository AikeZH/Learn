package chapter13.section3.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Accidental recursion
 * {RunByHand}
 *
 * @author zhanghua
 * @date 2020/10/16
 */
public class InfiniteRecursion {
    @Override
    public String toString() {
        return " InfiniteRecursion address: " + this + "\n";
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> v = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            v.add(new InfiniteRecursion());
        }
        System.out.println(v);
    }
}
