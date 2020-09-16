package chapter10.section5.innerclasses;

import chapter10.section4.innerclasses.Destination;

/**
 * Nesting a class within a method
 * @author zhanghua
 * @date 2020/9/16
 */
public class Parcel5 {
    public Destination destination(String s) {
        class PDestination implements Destination{
            private String label;

            private PDestination(String whereTo) {
                label = whereTo;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
    }
}
