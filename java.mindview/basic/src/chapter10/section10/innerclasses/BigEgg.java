package chapter10.section10.innerclasses;

/**
 * An inner class cannot be overridden like a method
 * @author ZhangHua
 * @date 2020/9/21
 */
public class BigEgg extends Egg{
    public class Yolk{
        public Yolk(){
            System.out.println("BigEgg.Yolk()");
        }
    }

    public static void main(String[] args) {
        new BigEgg();
    }
    /* Output:
    New Egg()
    Egg.Yolk()
     */
}
class Egg{
    private Yolk y;
    protected class Yolk{
        public Yolk() {
            System.out.println("Egg.Yolk()");
        }
    }

    public Egg() {
        System.out.println("New Egg()");
        y = new Yolk();
    }
}