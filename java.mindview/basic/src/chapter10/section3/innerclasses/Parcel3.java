package chapter10.section3.innerclasses;

/**
 * Using .new to create instances of inner classes
 * @author zhanghua
 * @date 2020/9/15
 */
public class Parcel3 {
    class Contents{
        private int i = 11;

        public int value() {
            return i;
        }
    }

    static class Destination{
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        // Must use instance of outer class to create an instance of the inner class
        Parcel3.Contents c = p.new Contents();
        Parcel3.Destination d = new Destination("Tasmania");
    }
}
