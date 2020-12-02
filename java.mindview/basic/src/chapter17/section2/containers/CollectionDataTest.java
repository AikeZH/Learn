package chapter17.section2.containers;

import util.CollectionData;
import util.Generator;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author zhanghua
 * @date 2020/12/2
 */
public class CollectionDataTest {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(new CollectionData<>(new Government(), 15));
        // Using the convenience method
        set.addAll(CollectionData.list(new Government(), 15));
        System.out.println(set);
    }
    /* Output:
    [strange, women, lying, in, ponds, distributing, swords, is, no, basis, for, a, system, of, government]
     */
}

class Government implements Generator<String> {
    String[] foundation = "strange women lying in ponds distributing swords is no basis for a system of government".split(" ");
    private int index;

    @Override
    public String next() {
        return foundation[index++];
    }
}