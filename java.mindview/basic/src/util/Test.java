package util;

import org.apache.commons.collections4.CollectionUtils;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhanghua
 * @date 2020/8/7
 */
public class Test {
    public static void main(String[] args) {
//        String test = "";
//        String[] split = test.split(",");
//        List<String> strings = Arrays.asList(split);
//        if (CollectionUtils.isNotEmpty(strings)) {
//            System.out.println("split is not empty");
//        }
//        System.out.println(split);
//        testBigDecimal();
        String s = "_";
        System.out.println(s.matches("\\W"));

    }

    public static void testBigDecimal() {
        BigDecimal d1 = new BigDecimal("123.4500");
        BigDecimal d2 = d1.stripTrailingZeros();
        System.out.println(d1.scale()); // 4
        System.out.println(d2.scale()); // 2,因为去掉了00

        BigDecimal d3 = new BigDecimal("1234500");
        BigDecimal d4 = d3.stripTrailingZeros();
        BigDecimal d5 = new BigDecimal("12345");
        System.out.println(d3.scale()); // 0
        System.out.println(d4.scale()); // -2
        System.out.println(d5.scale()); //
        System.out.println(d3); //
        System.out.println(d4);
        System.out.println(d5); //
    }
}
