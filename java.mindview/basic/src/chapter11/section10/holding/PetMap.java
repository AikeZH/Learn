package chapter11.section10.holding;

import chapter14.section3.typeinfo.pets.Cat;
import chapter14.section3.typeinfo.pets.Dog;
import chapter14.section3.typeinfo.pets.Hamster;
import chapter14.section3.typeinfo.pets.Pet;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 * @author ZhangHua
 * @date 2020/9/26
 */
public class PetMap {
    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<>();
        petMap.put("My Cat", new Cat("Molly"));
        petMap.put("My Dog", new Dog("Ginger"));
        petMap.put("My Hamster", new Hamster("Bosco"));
        System.out.println(petMap);
        Pet dog = petMap.get("My Dog");
        System.out.println(dog);
        System.out.println(petMap.containsKey("My Dog"));
        System.out.println(petMap.containsValue(dog));
    }
    /*
    {My Dog=chapter14.section3.typeinfo.pets.Dog@3a4afd8d, My Cat=chapter14.section3.typeinfo.pets.Cat@1996cd68, My Hamster=chapter14.section3.typeinfo.pets.Hamster@3339ad8e}
    chapter14.section3.typeinfo.pets.Dog@3a4afd8d
    false
    true
     */
}
