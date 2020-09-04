package chapter9.section1.interfaces.music4;

import chapter8.section1.polymorphism.music.Note;

/**
 * Abstract classed and methods
 *
 * @author zhanghua
 * @date 2020/9/4
 */
public class Music4 {
    // Doesn't care about type, so new types added to the system still work right
    static void tune(Instrument i) {
        //...
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] e){
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        // Upcasting during addition to the array
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
    /* Output:
    Wind.play() MIDDLE_C
    Percussion.play() MIDDLE_C
    Stringed.play() MIDDLE_C
    Brass.play() MIDDLE_C
    Woodwind.play() MIDDLE_C
     */
}

abstract class Instrument {
    private int i; // Storage allocated for each

    public abstract void play(Note n);

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();
}

class Wind extends Instrument {

    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {

    }
}

class Percussion extends Instrument {

    @Override
    public void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    public String what() {
        return "Percussion";
    }

    @Override
    public void adjust() {

    }
}

class Stringed extends Instrument {

    @Override
    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    public String what() {
        return "Stringed";
    }

    @Override
    public void adjust() {

    }
}

class Brass extends Wind {

    @Override
    public void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    @Override
    public void adjust() {

    }
}

class Woodwind extends Wind {
    @Override
    public void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    @Override
    public String what() {
        return "Woodwind";
    }
}
