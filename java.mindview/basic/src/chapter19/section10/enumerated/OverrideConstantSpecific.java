package chapter19.section10.enumerated;

/**
 * @author zhanghua
 * @date 2021/1/19
 */
public enum OverrideConstantSpecific {
    NUT, BOLT, WASHER {
        @Override
        void f() {
            System.out.println("Overridden method");
        }
    };

    void f() {
        System.out.println("default behavior");
    }

    public static void main(String[] args) {
        for (OverrideConstantSpecific item : OverrideConstantSpecific.values()) {
            System.out.print(item + ": ");
            item.f();
        }
    }
    /* Output:
    NUT: default behavior
    BOLT: default behavior
    WASHER: Overridden method
     */
}
