package chapter13.section4.strings;

import java.util.Locale;

/**
 * @author zhanghua
 * @date 2020/10/16
 */
public class TestStringMethod {
    public static void main(String[] args) {
        String base = "ABCDefghIJKLMN";
        String ohter = "ABCDefghIJKLMN";
        char[] dest = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        base.getChars(0, 4, dest, 6);
        System.out.println(base);
        System.out.println(dest);
        System.out.println("getBytes: " + base.getBytes());
        System.out.println("toCharArray: " + base.toCharArray());
        System.out.println("compareTo: " + base.compareTo("a"));
        System.out.println("contains: " + base.contains("abc"));
        System.out.println("contentEquals: " + base.contentEquals("abc"));
        System.out.println("contentEquals: " + base.contentEquals(new StringBuffer(ohter)));
        System.out.println("regionMatches: " + base.regionMatches(1, ohter, 1, ohter.length() - 1));
        System.out.println("startsWith: " + base.startsWith("BCD", 1));
        System.out.println("endsWith: " + base.endsWith("N"));
        System.out.println("indexOf: " + base.indexOf("ABC"));
        System.out.println("indexOf: " + base.indexOf("ABC", 5));
        System.out.println("lastIndexOf: " + base.lastIndexOf("ABC"));
        System.out.println("lastIndexOf: " + base.lastIndexOf("AB1C", 5));
        System.out.println("substring: " + base.substring(0, 5));
        System.out.println("concat: " + base.concat("XYZ"));
        System.out.println("replace: " + base.replace("A", "xxx"));
        System.out.println("replaceAll: " + base.replaceAll("A", "xxx"));
        System.out.println("toUpperCase: " + base.toUpperCase(Locale.ROOT));
        System.out.println("toLowerCase: " + base.toLowerCase(Locale.ROOT));
        System.out.println("trim: " + base.trim());
        System.out.println("valueOf: " + String.valueOf(123456));
        System.out.println("copyValueOf: " + String.copyValueOf(dest));
        String a = "abc";
        String b = new String("abc");
        System.out.println("a == b: " + (a == b));
        System.out.println("a == b.intern(): " + (a == b.intern()));

    }
}
