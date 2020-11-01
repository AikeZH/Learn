package chapter14.section4.typeinfo;

import chapter14.section4.typeinfo.factory.Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Registering Class Factories in the base class
 *
 * @author ZhangHua
 * @date 2020/10/28
 */
public class RegisteredFactories {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Part.createRandom());
        }
    }
    /* Output:
    GeneratorBelt
    CabinAirFilter
    GeneratorBelt
    AirFilter
    PowerSteeringBelt
    CabinAirFilter
    FuelFilter
    PowerSteeringBelt
    PowerSteeringBelt
    FuelFilter
     */
}

class Part {
    static List<Factory<? extends Part>> partFctories = new ArrayList<>();

    static {
        // Collections.addAll() gives an "unchecked generic array creation ... for varargs parameter" warning.
        partFctories.add(new FuelFilter.Factory());
        partFctories.add(new AirFilter.Factory());
        partFctories.add(new CabinAirFilter.Factory());
        partFctories.add(new OilFilter.Factory());
        partFctories.add(new FanBelt.Factory());
        partFctories.add(new PowerSteeringBelt.Factory());
        partFctories.add(new GeneratorBelt.Factory());
    }

    private static Random rand = new Random(47);

    public static Part createRandom() {
        int n = rand.nextInt(partFctories.size());
        return partFctories.get(n).create();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}

class Filter extends Part {
}

class FuelFilter extends Filter {
    // Create a Class Factory for each specific type
    public static class Factory implements chapter14.section4.typeinfo.factory.Factory<FuelFilter> {
        @Override
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}

class AirFilter extends Filter {
    public static class Factory implements chapter14.section4.typeinfo.factory.Factory<AirFilter> {
        @Override
        public AirFilter create() {
            return new AirFilter();
        }
    }
}

class CabinAirFilter extends AirFilter {
    public static class Factory implements chapter14.section4.typeinfo.factory.Factory<CabinAirFilter> {
        @Override
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}

class OilFilter extends Filter {
    public static class Factory implements chapter14.section4.typeinfo.factory.Factory<OilFilter> {
        @Override
        public OilFilter create() {
            return new OilFilter();
        }
    }
}

class Belt extends Part {
}

class FanBelt extends Belt {
    public static class Factory implements chapter14.section4.typeinfo.factory.Factory<FanBelt> {
        @Override
        public FanBelt create() {
            return new FanBelt();
        }
    }
}

class GeneratorBelt extends Belt {
    public static class Factory implements chapter14.section4.typeinfo.factory.Factory<GeneratorBelt> {
        @Override
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }
}

class PowerSteeringBelt extends Belt {
    public static class Factory implements chapter14.section4.typeinfo.factory.Factory<PowerSteeringBelt> {
        @Override
        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}
