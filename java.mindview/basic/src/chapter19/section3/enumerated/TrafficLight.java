package chapter19.section3.enumerated;

/**
 * Enums in switch statements
 *
 * @author zhanghua
 * @date 2021/1/15
 */
public class TrafficLight {
    Signal color = Signal.RED;

    public void change() {
        switch (color) {
            case RED:
                color = Signal.GREEN;
                break;
            case GREEN:
                color = Signal.YELLOW;
                break;
            case YELLOW:
                color = Signal.RED;
            default:
        }
    }

    @Override
    public String toString() {
        return "The traffic light is " + color;
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        for (int i = 0; i < 7; i++) {
            System.out.println(trafficLight);
            trafficLight.change();
        }
    }
    /* Output:
    The traffic light is RED
    The traffic light is GREEN
    The traffic light is YELLOW
    The traffic light is RED
    The traffic light is GREEN
    The traffic light is YELLOW
    The traffic light is RED
     */
}

// Define an enum type
enum Signal {
    GREEN, YELLOW, RED
}