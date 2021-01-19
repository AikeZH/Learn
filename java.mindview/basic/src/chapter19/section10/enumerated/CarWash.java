package chapter19.section10.enumerated;

import java.util.EnumSet;

/**
 * @author zhanghua
 * @date 2021/1/19
 */
public class CarWash {
    public enum Cycle{
        UNDERBODY{
            @Override
            void action() {
                System.out.println("Spraying the underbody");
            }
        },
        WHEEL_WASH {
            @Override
            void action() {
                System.out.println("Washing the wheels");
            }
        },
        PRE_WASH {
            @Override
            void action() {
                System.out.println("Loosening the dirt");
            }
        },
        BASIC {
            @Override
            void action() {
                System.out.println("The basic wash");
            }
        },
        HOT_WAX {
            @Override
            void action() {
                System.out.println("Applying hot wax");
            }
        },
        RINSE {
            @Override
            void action() {
                System.out.println("Rinsing");
            }
        },
        BLOW_DRY {
            @Override
            void action() {
                System.out.println("Blowing dry");
            }
        };
        abstract void action();
    }

    EnumSet<Cycle> cycleEnumSet = EnumSet.of(Cycle.BASIC, Cycle.RINSE);

    public void add(Cycle cycle) {
        cycleEnumSet.add(cycle);
    }

    public void washCar() {
        for (Cycle item : cycleEnumSet) {
            item.action();
        }
    }

    public String toString() {
        return cycleEnumSet.toString();
    }

    public static void main(String[] args) {
        CarWash wash = new CarWash();
        System.out.println(wash);
        wash.washCar();
        // Order of addition is unimportant
        wash.add(Cycle.UNDERBODY);
        // Duplicates ignored
        wash.add(Cycle.UNDERBODY);
        wash.add(Cycle.RINSE);
        wash.add(Cycle.HOT_WAX);
        System.out.println(wash);
        wash.washCar();
    }
    /* Output:
    [BASIC, RINSE]
    The basic wash
    Rinsing
    [UNDERBODY, BASIC, HOT_WAX, RINSE]
    Spraying the underbody
    The basic wash
    Applying hot wax
    Rinsing
     */
}
