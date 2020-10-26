package chapter14.section2.typeinfo;

/**
 * Examination of the way the class loader works
 *
 * @author zhanghua
 * @date 2020/10/22
 */
public class SweetShop {
    public static void main(String[] args) {
        System.out.println("Inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
            Class.forName("chapter14.section1.typeinfo.Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Couldn't find Gum");
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");
    }
    /* Output:
    Inside main
    Loading Candy
    After creating Candy
    Loading Gum
    After Class.forName("Gum")
    Loading Cookie
    After creating Cookie
     */
}

class Candy {
    static {
        System.out.println("Loading Candy");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}