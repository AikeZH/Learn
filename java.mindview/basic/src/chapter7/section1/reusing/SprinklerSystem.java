package chapter7.section1.reusing;

/**
 * reusing.SprinklerSystem
 * Composition for code reuse.
 * @author zhanghua
 * @date 2020/8/3
 */
public class SprinklerSystem {
    private String value1, value2, value3, value4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    public String toString() {
        return "value1 = " + value1 + " " +
                "value2 = " + value2 + " " +
                "value3 = " + value3 + " " +
                "value4 = " + value4 + "\n" +
                "i = " + i + " " + "f = " + f + " " +
                "source = " + source;
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklers = new SprinklerSystem();
        System.out.println(sprinklers);
    }
    /* Output:
    WaterSource()
    value1 = null value2 = null value3 = null value4 = null
    i = 0 f = 0.0 source = Constructed
     */
}

class WaterSource {
    private String s;

    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}