package chapter7.section1.reusing;

import static util.Print.println;

/**
 * reusing.Bath.java
 * Constructor initialization with composition
 *
 * @author zhanghua
 * @date 2020/8/3
 */
public class Bath {
    private String s1 = "Happy", s2 = "Happy", s3, s4; // Initializing at point of definition;
    private Soap castile;
    private int i;
    private float toy;

    public Bath() {
        println("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        castile = new Soap();
    }

    // Instance initialization:
    {
        println("Instance initialization");
        i = 47;
    }

    public String toString() {
        // Delayed initialization:
        if (s4 == null) {
            s4 = "Joy";
        }
        return "s1 = " + s1 + "\n" +
                "s2 = " + s2 + "\n" +
                "s3 = " + s3 + "\n" +
                "s4 = " + s4 + "\n" +
                "i = " + i + "\n" +
                "toy = " + toy + "\n" +
                "castile = " + castile;
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        println(b);
    }
    /*
    Instance initialization
    Inside Bath()
    Soap()
    s1 = Happy
    s2 = Happy
    s3 = Joy
    s4 = Joy
    i = 47
    toy = 3.14
    castile = Constructed
     */
}

class Soap {
    private String s;

    Soap() {
        println("Soap()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}