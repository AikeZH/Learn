package chapter10.section6.innerclasses;

/**
 * Calling the base-class constructor
 *
 * @author zhanghua
 * @date 2020/9/16
 */
public class Parcel8 {
    public Wrapping wrapping(int x) {
        return new Wrapping(x) { // Pass constructor argument
            @Override
            public int value() {
                return super.value() * 47;
            }
        }; // Semicolon required
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
    }
}
