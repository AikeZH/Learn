package chapter9.section3.interfaces.filters;

/**
 * @author zhanghua
 * @date 2020/9/7
 */
public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) {
        return input;
    }
}
