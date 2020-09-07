package chapter9.section3.interfaces.interfaceprocessor;

import chapter9.section3.interfaces.filters.*;

/**
 * @author ZhangHua
 * @date 2020/9/7
 */
public class FilterProcessor {
    public static void main(String[] args) {
        Waveform w = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)), w);
        Apply.process(new FilterAdapter(new HighPass(2.0)), w);
        Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
    }
    /*
    Using Processor FilterAdapter
    Waveform 0
    Using Processor FilterAdapter
    Waveform 0
    Using Processor FilterAdapter
    Waveform 0
     */
}

class FilterAdapter implements Processor {
    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}