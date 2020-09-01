package chapter8.section2.polymorphism;

/**
 * Static methods are not polymorphic
 * @author zhanghua
 * @date 2020/9/1
 */
public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper sup = new StaticSub(); // Upcast
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());
    }
    /* Output:
    Base staticGet()
    Derived dynamicGet()
     */
}
class StaticSuper{
    public static String staticGet(){
        return "Base staticGet()";
    }
    public String dynamicGet(){
        return "Base dynamicGet()";
    }
}
class StaticSub extends StaticSuper{
    public static String staticGet(){
        return "Derived staticGet()";
    }
    @Override
    public String dynamicGet(){
        return "Derived dynamicGet()";
    }
}
