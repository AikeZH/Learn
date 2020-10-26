package chapter13.section6.strings;

import java.util.Arrays;

/**
 * @author zhanghua
 * @date 2020/10/19
 */
public class Splitting {
    public static String knights = "Then, when you have found the shrubbery, " +
            "you must cut down the mightiest tree in the forest... with... a herring!";

    public static void split(String regex) {
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
        // Doesn't have to contain regex chars
        split(" ");
        // Non-word characters
        split("\\W+");
        // 'n' followed by non-word characters
        split("n\\W+");
    }
    /*
    [Then,, when, you, have, found, the, shrubbery,, you, must,
    cut, down, the, mightiest, tree, in, the, forest...,
    with..., a, herring!]
    [Then, when, you, have, found, the, shrubbery, you, must,
    cut, down, the, mightiest, tree, in, the, forest, with, a, herring]
    [The, whe, you have found the shrubbery, you must cut dow,
    the mightiest tree i, the forest... with... a herring!]
     */
}
