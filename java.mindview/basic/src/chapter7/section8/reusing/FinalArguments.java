package chapter7.section8.reusing;

/**
 * Using "final" with method arguments
 *
 * @author zhanghua
 * @date 2020/8/18
 */
public class FinalArguments {
    void with(final Gizmo g) {
        //! g = new Gizmo(); // Illegal -- g is final
    }

    void without(Gizmo g) {
        g = new Gizmo(); // Ok -- g not final
        g.spin();
    }

    // void f(final int i){ i++;} // Can't change
    // You can only read from a final primitive
    int g(final int i) {
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
}

class Gizmo {
    public void spin() {
    }
}
