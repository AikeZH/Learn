package chapter9.section3.interfaces.filters;

/**
 * @author zhanghua
 * @date 2020/9/7
 */
public class HighPass extends Filter{
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
