package chapter9.section3.interfaces.interfaceprocessor;

import java.util.Arrays;

/**
 * @author ZhangHua
 * @date 2020/9/7
 */
public abstract class StringProcessor implements Processor {

    public static String s = "If she weighs the same as a duck, she's made of wood";

    public abstract Object process(Object input);

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    public static void main(String[] args) {
        Apply.process(new Upcase(), s);
        Apply.process(new Downcase(), s);
        Apply.process(new Splitter(), s);
    }
    /*
    Using Processor Upcase
    IF SHE WEIGHS THE SAME AS A DUCK, SHE'S MADE OF WOOD
    Using Processor Downcase
    if she weighs the same as a duck, she's made of wood
    Using Processor Splitter
    [If, she, weighs, the, same, as, a, duck,, she's, made, of, wood]
     */
}

class Upcase extends StringProcessor {

    @Override
    public Object process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase extends StringProcessor {

    @Override
    public Object process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends StringProcessor{
    @Override
    public Object process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}