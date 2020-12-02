package chapter17.section2.containers;

import util.CollectionData;
import util.RandomGenerator;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Using the Generators defined in the Arrays chapter
 *
 * @author zhanghua
 * @date 2020/12/2
 */
public class CollectionDataGeneration {
    public static void main(String[] args) {
        // Convenience method
        System.out.println(new ArrayList<>(CollectionData.list(new RandomGenerator.String(9), 10)));
        System.out.println(new HashSet<>(new CollectionData<>(new RandomGenerator.Integer(), 10)));
    }
    /* Output:
    [YNzbrnyGc, FOWZnTcQr, GseGZMmJM, RoEsuEcUO, neOEdLsmw, HLGEahKcx, rEqUCBbkI, naMesbtWH, kjUrUkZPg, wsqPzDyCy]
    [2017, 8037, 871, 7882, 6090, 4779, 299, 573, 4367, 3455]
     */
}
