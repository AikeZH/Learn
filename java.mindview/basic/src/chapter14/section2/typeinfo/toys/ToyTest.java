package chapter14.section2.typeinfo.toys;

/**
 * Testing class Class
 *
 * @author zhanghua
 * @date 2020/10/22
 */
public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("chapter14.section1.typeinfo.toys.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
    /* Output:
    Class name: chapter14.section1.typeinfo.toys.FancyToy is interface? [false]
    Simple name: FancyToy
    Canonical name: chapter14.section1.typeinfo.toys.FancyToy
    Class name: chapter14.section1.typeinfo.toys.HasBatteries is interface? [true]
    Simple name: HasBatteries
    Canonical name: chapter14.section1.typeinfo.toys.HasBatteries
    Class name: chapter14.section1.typeinfo.toys.Waterproof is interface? [true]
    Simple name: Waterproof
    Canonical name: chapter14.section1.typeinfo.toys.Waterproof
    Class name: chapter14.section1.typeinfo.toys.Shoots is interface? [true]
    Simple name: Shoots
    Canonical name: chapter14.section1.typeinfo.toys.Shoots
    Class name: chapter14.section1.typeinfo.toys.Toy is interface? [false]
    Simple name: Toy
    Canonical name: chapter14.section1.typeinfo.toys.Toy
     */
}

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
    // Comment out the following default constructor to see NoSuchMethodError from (*1*)
    Toy() {
    }

    Toy(int i) {
    }
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }
}