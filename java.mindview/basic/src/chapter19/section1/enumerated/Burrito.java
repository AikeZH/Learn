package chapter19.section1.enumerated;

import static chapter19.section1.enumerated.Spiciness.*;

/**
 * @author zhanghua
 * @date 2021/1/15
 */
public class Burrito {
    Spiciness degree;

    public Burrito(Spiciness degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Burrito is " + degree;
    }

    public static void main(String[] args) {
        System.out.println(new Burrito(NOT));
        System.out.println(new Burrito(MEDIUM));
        System.out.println(new Burrito(HOT));
    }
    /* Output:
    Burrito is NOT
    Burrito is MEDIUM
    Burrito is HOT
     */
}
