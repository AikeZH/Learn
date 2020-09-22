package chapter11.section1.holding;

import java.util.ArrayList;

/**
 * @author ZhangHua
 * @date 2020/9/22
 */
public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for (Apple c : apples) {
            System.out.println(c);
        }
        /* Output:(Sample)
        chapter11.section1.holding.GrannySmith@64b8f8f4
        chapter11.section1.holding.Gala@2db0f6b2
        chapter11.section1.holding.Fuji@3cd1f1c8
        chapter11.section1.holding.Braeburn@3a4afd8d
         */
    }
}

class GrannySmith extends Apple {
}

class Gala extends Apple {
}

class Fuji extends Apple {
}

class Braeburn extends Apple {
}