package chapter11.section1.holding;

import java.util.ArrayList;

/**
 * @author ZhangHua
 * @date 2020/9/22
 */
public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        // Compile-time error
        //! apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            System.out.println(apples.get(i).id());
        }
        // Using foreach
        for (Apple c : apples) {
            System.out.println(c.id());
        }
    }
    /* Output:
    0
    1
    2
    0
    1
    2
     */
}
