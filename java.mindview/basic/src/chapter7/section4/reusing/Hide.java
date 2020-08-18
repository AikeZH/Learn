package chapter7.section4.reusing;

/**
 * reusing.Hide.java
 * Overloading a base-class method name in a derived class does not hide the basic-class versions
 *
 * @author zhanghua
 * @date 2020/8/17
 */
public class Hide {
    public static void main(String[] args) {
        Bart bart = new Bart();
        bart.doh(1);
        bart.doh('x');
        bart.doh(1.0f);
        bart.doh(new Milhouse());
    }
    /* Output:
    doh(float)
    doh(char)
    doh(float)
    doh(Milhouse)
     */
}

class Homer {
    char doh(char c) {
        System.out.println("doh(char)");
        return 'd';
    }

    float doh(float f) {
        System.out.println("doh(float)");
        return 1.0f;
    }
}

class Milhouse {
}

class Bart extends Homer {
    void doh(Milhouse milhouse) {
        System.out.println("doh(Milhouse)");
    }
//    float doh(float f){
//        System.out.println("Bart doh(float)");
//        return 2.0f;
//    }
}