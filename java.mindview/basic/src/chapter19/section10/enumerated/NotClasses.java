package chapter19.section10.enumerated;

/**
 * {Exec: javap- c LikeClasses}
 * @author zhanghua
 * @date 2021/1/19
 */
public class NotClasses {
    // Nope
    // void f1(LikeClasses.WINKEN instance){}
}
/* Output:
    Compiled from "NotClasses.java"
    abstract class chapter19.section10.enumerated.LikeClasses extends java.lang.Enum<chapter19.section10.enumerated.LikeClasses> {
      public static final chapter19.section10.enumerated.LikeClasses WINKEN;
      public static final chapter19.section10.enumerated.LikeClasses BLINKEN;
      public static final chapter19.section10.enumerated.LikeClasses NOD;
      public static chapter19.section10.enumerated.LikeClasses[] values();
      public static chapter19.section10.enumerated.LikeClasses valueOf(java.lang.String);
      abstract void behavior();
      chapter19.section10.enumerated.LikeClasses(java.lang.String, int, chapter19.section10.enumerated.LikeClasses$1);
      static {};
}

 */

enum LikeClasses{
    WINKEN{
        @Override
        void behavior() {
            System.out.println("Behavior1");
        }
    },
    BLINKEN{
        @Override
        void behavior() {
            System.out.println("Behavior2");
        }
    },
    NOD{
        @Override
        void behavior() {
            System.out.println("Behavior3");
        }
    };

    abstract void behavior();
}