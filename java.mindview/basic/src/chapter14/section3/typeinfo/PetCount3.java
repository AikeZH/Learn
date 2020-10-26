package chapter14.section3.typeinfo;

import chapter14.section3.typeinfo.pets.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * TODO after chapter 17
 * Using isInstance()
 *
 * @author ZhangHua
 * @date 2020/10/26
 */
public class PetCount3 {
    static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer> {
        static Map<Class<? extends Pet>, Integer> map = new LinkedHashMap<>();

        static {
            map.put(Pet.class, 0);
            map.put(Dog.class, 0);
            map.put(Cat.class, 0);
            map.put(Rodent.class, 0);
            map.put(Mutt.class, 0);
            map.put(Pug.class, 0);
            map.put(EgyptianMau.class, 0);
            map.put(Manx.class, 0);
            map.put(Cymric.class, 0);
            map.put(Rat.class, 0);
            map.put(Mouse.class, 0);
            map.put(Hamster.class, 0);
        }

        public PetCounter() {
            super(map);
        }

        public void count(Pet pet) {
            // Class.isInstance() eliminates instanceofs
            for (Map.Entry<Class<? extends Pet>, Integer> pair : map.entrySet()) {
                if (pair.getKey().isInstance(pet)){
                    map.put(pair.getKey(), pair.getValue() + 1);
                }
            }
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder("{");
            for (Map.Entry<Class<? extends Pet>, Integer> pair : map.entrySet()) {
                result.append(pair.getKey().getSimpleName());
                result.append("=");
                result.append(pair.getValue());
                result.append(", ");
            }
            result.delete(result.length() - 2, result.length());
            result.append("}");
            return result.toString();
        }
    }

    public static void main(String[] args) {
        PetCounter petCount = new PetCounter();
        for (Pet pet : Pets.createArray(20)) {
            System.out.print(pet.getClass().getSimpleName() + " ");
            petCount.count(pet);
        }
        System.out.println();
        System.out.println(petCount);
    }
    /*
    Rat Manx Cymric Mutt Pug Cymric Pug Manx Cymric Rat EgyptianMau
    Hamster EgyptianMau Mutt Mutt Cymric Mouse Pug Mouse Cymric
    {Pet=20, Dog=6, Cat=9, Rodent=5, Mutt=3, Pug=3, EgyptianMau=2,
    Manx=7, Cymric=5, Rat=2, Mouse=2, Hamster=1}
     */
}
