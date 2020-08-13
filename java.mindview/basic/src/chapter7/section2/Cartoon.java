package chapter7.section2;

/**
 * @author zhanghua
 * @date 2020/8/13
 */
public class Cartoon extends Drawing{
    public Cartoon(){
        System.out.println("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
    /* Output:
    Art constructor
    Drawing constructor
    Cartoon constructor
     */
}

class Art{
    Art(){
        System.out.println("Art constructor");
    }
}
class Drawing extends Art{
    Drawing(){
        System.out.println("Drawing constructor");
    }
}