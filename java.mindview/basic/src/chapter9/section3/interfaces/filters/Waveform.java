package chapter9.section3.interfaces.filters;

/**
 * @author zhanghua
 * @date 2020/9/7
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Waveform " + id;
    }
}
