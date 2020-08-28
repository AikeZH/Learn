package chapter8.section1.polymorphism.music;

/**
 * Inheritance & upcasting
 * @author zhanghua
 * @date 2020/8/28
 */
public class Music {
    public static void tune(Instrument i){
        // ...
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute); // Upcasting
    }
    /* Output:
    Wind.play() MIDDLE_C
     */
}
