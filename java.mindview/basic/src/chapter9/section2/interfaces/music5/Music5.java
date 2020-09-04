package chapter9.section2.interfaces.music5;

import chapter8.section1.polymorphism.music.Note;

/**
 * @author zhanghua
 * @date 2020/9/4
 */
public class Music5 {
    // Doesn't care about type, so new types added to the system still work right
    static void tune(Instrument i) {
        //...
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
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

interface Instrument {
    // Compile-time constant
    int VALUE = 5; // static & final

    // Cannot have method definitions
    void play(Note n); // Automatically

    void adjust();
}

class Wind implements Instrument {

    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public String toString() {
        return "Wind";
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Percussion implements Instrument {

    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public String toString() {
        return "Percussion";
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Stringed implements Instrument {

    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public String toString() {
        return "Stringed";
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Brass extends Wind {
    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    @Override
    public String toString() {
        return "Woodwind";
    }
}