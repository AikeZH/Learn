package chapter10.section7.innerclasses;

import chapter10.section4.innerclasses.Contents;
import chapter10.section4.innerclasses.Destination;

/**
 * Nested classes (static inner class)
 *
 * @author zhanghua
 * @date 2020/9/17
 */
public class Parcel11 {
    private static class ParcelContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }
    protected static class ParcelDestination implements Destination{
        private String label;

        private ParcelDestination(String whereTo) {
            label = whereTo;
        }
        @Override
        public String readLabel() {
            return label;
        }

        // Nested classes can contain other static elements
        public static void f(){}
        static int x = 10;
        static class AnotherLevel{
            public void f(){}
            static int x =10;
        }
    }

    public static Destination destination(String s) {
        return new ParcelDestination(s);
    }

    public static Contents contents() {
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents c = contents();
        Destination d = destination("Tasmania");
    }
}
