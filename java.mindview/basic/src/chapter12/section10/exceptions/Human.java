package chapter12.section10.exceptions;

/**
 * Catching exception hierarchies
 *
 * @author zhanghua
 * @date 2020/10/12
 */
public class Human {
    public static void main(String[] args) {
        // Catch the exact type
        try {
            throw new Sneeze();
        } catch (Sneeze sneeze) {
            System.out.println("Caught Sneeze");
        } catch (Annoyance annoyance) {
            System.out.println("Caught Annoyance");
        }
        // Catch the base type
        try {
            throw new Annoyance();
        } catch (Annoyance annoyance) {
            System.out.println("Caught Annoyance");
        }
    }
    /* Output:
    Caught Sneeze
    Caught Annoyance
     */
}

class Annoyance extends Exception {
}

class Sneeze extends Annoyance {
}
