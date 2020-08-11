package util;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhanghua
 * @date 2020/8/7
 */
public class Test {
    public static void main(String[] args) {
        String test = "";
        String[] split = test.split(",");
        List<String> strings = Arrays.asList(split);
        if (CollectionUtils.isNotEmpty(strings)) {
            System.out.println("split is not empty");
        }
        System.out.println(split);
    }
}
