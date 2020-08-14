package chapter7.section4.reusing;

/**
 * reusing.PlaceSetting.java
 * Combining composition & inheritance
 * @author zhanghua
 * @date 2020/8/14
 */
public class PlaceSetting extends Custom{
    private Spoon spoon;
    private Fork fork;
    private Knife knife;
    private DinnerPlate dinnerPlate;
    public PlaceSetting(int i){
        super(i+1);
        this.spoon = new Spoon(i+2);
        this.fork = new Fork(i+3);
        this.knife = new Knife(i+4);
        this.dinnerPlate = new DinnerPlate(i+5);
        System.out.println("PlaceSetting constructor");
    }

    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(9);
    }
    /*
    Custom constructor
    Utensil constructor
    Spoon constructor
    Utensil constructor
    Fork constructor
    Utensil constructor
    Knife constructor
    Plate constructor
    DinnerPlate constructor
    PlaceSetting constructor
     */
}

// A cultural way of doing something
class Custom {
    Custom(int i) {
        System.out.println("Custom constructor");
    }
}

class Plate {
    Plate(int i) {
        System.out.println("Plate constructor");
    }
}

class DinnerPlate extends Plate {
    DinnerPlate(int i) {
        super(i);
        System.out.println("DinnerPlate constructor");
    }
}

class Utensil {
    Utensil(int i) {
        System.out.println("Utensil constructor");
    }
}

class Spoon extends Utensil {
    Spoon(int i) {
        super(i);
        System.out.println("Spoon constructor");
    }
}

class Fork extends Utensil {
    Fork(int i) {
        super(i);
        System.out.println("Fork constructor");
    }
}

class Knife extends Utensil {
    Knife(int i) {
        super(i);
        System.out.println("Knife constructor");
    }
}
