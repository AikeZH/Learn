package chapter17.section2.containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The Collections fill() & Collections.nCopies() methods
 *
 * @author zhanghua
 * @date 2020/12/2
 */
public class FillingLists {
    public static void main(String[] args) {
        List<StringAddress> list = new ArrayList<>(Collections.nCopies(4, new StringAddress("Hello")));
        System.out.println(list);
        Collections.fill(list, new StringAddress("World!"));
        System.out.println(list);
    }
    /* Output:
    [chapter17.section2.containers.StringAddress@27ddd392 Hello,
    chapter17.section2.containers.StringAddress@27ddd392 Hello,
    chapter17.section2.containers.StringAddress@27ddd392 Hello,
    chapter17.section2.containers.StringAddress@27ddd392 Hello]
    [chapter17.section2.containers.StringAddress@19e1023e World!,
    chapter17.section2.containers.StringAddress@19e1023e World!,
    chapter17.section2.containers.StringAddress@19e1023e World!,
    chapter17.section2.containers.StringAddress@19e1023e World!]
     */
}

class StringAddress {
    private String s;

    public StringAddress(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + s;
    }
}
