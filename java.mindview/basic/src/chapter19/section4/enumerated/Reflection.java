package chapter19.section4.enumerated;

import util.OSExecute;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

/**
 * Analyzing enums using reflection
 *
 * @author zhanghua
 * @date 2021/1/15
 */
public class Reflection {
    public static Set<String> analyze(Class<?> enumClass) {
        System.out.println("----- Analyzing " + enumClass + " -----");
        System.out.println("Interfaces:");
        for (Type item : enumClass.getGenericInterfaces()) {
            System.out.println(item);
        }
        System.out.println("Base: " + enumClass.getSuperclass());
        System.out.println("Methods: ");
        Set<String> methods = new TreeSet<>();
        for (Method item : enumClass.getMethods()) {
            methods.add(item.getName());
        }
        System.out.println(methods);
        return methods;
    }

    public static void main(String[] args) {
        Set<String> exploreMethods = analyze(Explore.class);
        Set<String> enumMethods = analyze(Enum.class);
        System.out.println("Explore.containsAll(Enum)? " + exploreMethods.containsAll(enumMethods));
        System.out.println("Explore.removeAll(Enum): " + exploreMethods.removeAll(enumMethods));
        System.out.println(exploreMethods);
        // Decompile the code for the enum:
        OSExecute.command("javap java.mindview/out/chapter19/section4/enumerated/Explore.class");
    }
    /* Output:
    ----- Analyzing class chapter19.section4.enumerated.Explore -----
    Interfaces:
    Base: class java.lang.Enum
    Methods:
    [compareTo, equals, getClass, getDeclaringClass, hashCode, name, notify, notifyAll, ordinal, toString, valueOf, values, wait]
    ----- Analyzing class java.lang.Enum -----
    Interfaces:
    java.lang.Comparable<E>
    interface java.io.Serializable
    Base: class java.lang.Object
    Methods:
    [compareTo, equals, getClass, getDeclaringClass, hashCode, name, notify, notifyAll, ordinal, toString, valueOf, wait]
    Explore.containsAll(Enum)? true
    Explore.removeAll(Enum): true
    [values]
    Compiled from "Reflection.java"
    final class chapter19.section4.enumerated.Explore extends java.lang.Enum<chapter19.section4.enumerated.Explore> {
      public static final chapter19.section4.enumerated.Explore HERE;
      public static final chapter19.section4.enumerated.Explore THERE;
      public static chapter19.section4.enumerated.Explore[] values();
      public static chapter19.section4.enumerated.Explore valueOf(java.lang.String);
      static {};
    }
     */
}

enum Explore {
    HERE, THERE
}
