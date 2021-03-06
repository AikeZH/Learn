package chapter14.section6.typeinfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * Using reflection to show all the methods of a class,
 * even if the methods are defined in the base class
 * {Args: chapter14.section6.typeinfo.ShowMethods}
 *
 * @author zhanghua
 * @date 2020/11/3
 */
public class ShowMethods {
    private static String usage =
            "usage:\n" +
                    "ShowMethods qualified.class.name\n" +
                    "To show all methods in class or:\n" +
                    "ShowMethods qualified.class.name word\n" +
                    "To search for methods involving 'word'";
    private static Pattern p = Pattern.compile("\\w+\\.");

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println(usage);
            System.exit(0);
        }
        int lines = 0;
        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] constructors = c.getConstructors();
            if (args.length == 1) {
                for (Method method : methods) {
                    System.out.println(p.matcher(method.toString()).replaceAll(""));
                }
                for (Constructor constructor : constructors) {
                    System.out.println(p.matcher(constructor.toString()).replaceAll(""));
                }
                lines = methods.length + constructors.length;
            } else {
                for (Method method : methods) {
                    if (method.toString().indexOf(args[1]) != -1) {
                        System.out.println(p.matcher(method.toString()).replaceAll(""));
                        lines++;
                    }
                }
                for (Constructor constructor : constructors) {
                    if (constructor.toString().indexOf(args[1]) != -1) {
                        System.out.println(p.matcher(constructor.toString()).replaceAll(""));
                        lines++;
                    }
                }
            }

        } catch (ClassNotFoundException e) {
            System.out.println("No such class: " + e);
        }
    }
    /* Output:
    public static void main(String[])
    public final void wait() throws InterruptedException
    public final void wait(long,int) throws InterruptedException
    public final native void wait(long) throws InterruptedException
    public boolean equals(Object)
    public String toString()
    public native int hashCode()
    public final native Class getClass()
    public final native void notify()
    public final native void notifyAll()
    public ShowMethods()
     */
}
