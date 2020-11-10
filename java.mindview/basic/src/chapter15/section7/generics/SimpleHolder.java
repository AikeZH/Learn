package chapter15.section7.generics;

/**
 * @author zhanghua
 * @date 2020/11/10
 */
public class SimpleHolder {
    private Object obj;

    public Object get() {
        return obj;
    }

    public void set(Object obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        SimpleHolder holder = new SimpleHolder();
        holder.set("Item");
        String s = (String) holder.get();
    }
}
