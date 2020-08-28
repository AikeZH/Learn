package chapter8.section1.polymorphism.music;

/**
 * Wind objects are instruments because they have the same interface
 *
 * @author zhanghua
 * @date 2020/8/28
 */
public class Wind extends Instrument {
    // Redefine interface method
    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}
