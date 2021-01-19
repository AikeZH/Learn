package chapter19.section9.enumerated;

import chapter19.section8.enumerated.AlarmPoints;

import java.util.EnumMap;
import java.util.Map;

import static chapter19.section8.enumerated.AlarmPoints.*;

/**
 * Basics of EnumMaps
 *
 * @author zhanghua
 * @date 2021/1/19
 */
public class EnumMaps {
    public static void main(String[] args) {
        Map<AlarmPoints, Command> enumMap = new EnumMap<>(AlarmPoints.class);
        enumMap.put(KITCHEN, () -> System.out.println("Kitchen fire!"));
        enumMap.put(BATHROOM, ()-> System.out.println("Bathroom alert!"));
        for (Map.Entry<AlarmPoints, Command> item : enumMap.entrySet()) {
            System.out.print(item.getKey()+": ");
            item.getValue().action();
        }
        // If there's no value for a particular key
        try {
            enumMap.get(UTILITY).action();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    /* Output:
    BATHROOM: Bathroom alert!
    KITCHEN: Kitchen fire!
    java.lang.NullPointerException
     */
}

interface Command {
    void action();
}