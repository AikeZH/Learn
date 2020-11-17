package chapter15.section10.generics;

/**
 * @author zhanghua
 * @date 2020/11/11
 */
public class CovariantArrays {
    public static void main(String[] args) {
        Fruit[] fruit = new Apple[10];
        // OK
        fruit[0] = new Apple();
        fruit[1] = new Jonathan();
        // Runtime type is Apple[], not Fruit[] or Orange[]
        try {
            // Compiler allows you to add Fruit
            // ArrayStoreException
            fruit[0] = new Fruit();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            // Compiler allows you to add Fruit
            // ArrayStoreException
            fruit[0] = new Orange();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    /* Output:
    java.lang.ArrayStoreException: chapter15.section9.generics.Fruit
    java.lang.ArrayStoreException: chapter15.section9.generics.Orange
     */
}

class Fruit {
}

class Apple extends Fruit {
}

class Jonathan extends Apple {
}

class Orange extends Fruit {
}
