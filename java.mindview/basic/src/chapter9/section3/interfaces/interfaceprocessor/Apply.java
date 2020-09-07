package chapter9.section3.interfaces.interfaceprocessor;

/**
 * @author ZhangHua
 * @date 2020/9/7
 */
public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}
