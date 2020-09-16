package chapter10.section6.innerclasses;

import chapter10.section4.innerclasses.Destination;

/**
 * An anonymous inner class that performs initialization.
 * A briefer version of Parcel5.java
 * @author zhanghua
 * @date 2020/9/16
 */
public class Parcel9 {
    // Argument must be final to use inside anonymous inner class
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Tasmania");
    }
}
