package chapter11.section9.holding;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 输出为顺序是因为JDK1.8的实现不一样，HashSet是不保证有序
 * 详情参考：https://www.zhihu.com/question/28414001
 * @author zhanghua
 * @date 2020/9/25
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            intset.add(rand.nextInt(30));
        }
        System.out.println(intset);
    }
    /* Output:
    [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29]
     */
}
