package chapter9.section3.interfaces.interfaceprocessor;

/**
 * @author ZhangHua
 * @date 2020/9/7
 */
public interface Processor {
    String name();

    Object process(Object input);
}
