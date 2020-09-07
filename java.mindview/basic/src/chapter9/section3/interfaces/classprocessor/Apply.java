package chapter9.section3.interfaces.classprocessor;

import java.util.Arrays;

/**
 * @author zhanghua
 * @date 2020/9/7
 */
public class Apply {
    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void process(Processor p, Object obj) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(obj));
    }

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
    /*
    Using Processor Upcase
    DISAGREEMENT WITH BELIEFS IS BY DEFINITION INCORRECT
    Using Processor Downcase
    disagreement with beliefs is by definition incorrect
    Using Processor Splitter
    [Disagreement, with, beliefs, is, by, definition, incorrect]
     */
}

class Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;
    }
}

class Upcase extends Processor {
    @Override
    String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase extends Processor {
    @Override
    String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends Processor {
    @Override
    String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}