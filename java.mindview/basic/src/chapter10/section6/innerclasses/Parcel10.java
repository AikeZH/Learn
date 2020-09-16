package chapter10.section6.innerclasses;

import chapter10.section4.innerclasses.Destination;

/**
 * Using "instance initialization" to perform construction on an anonymous inner class
 * @author zhanghua
 * @date 2020/9/16
 */
public class Parcel10 {
    public Destination destination(final String dest, final float price) {
        return new Destination() {
            private int cost;
            // Instance initialization for each object
            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("Over budget!");
                }
            }
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Tasmania", 101.395F);
    }
    /* Output:
    Over budget!
     */
}
