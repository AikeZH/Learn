package chapter14.section7.typeinfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ZhangHua
 * @date 2020/11/4
 */
public class SimpleDynamicProxy {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        // Insert a proxy and call again
        Interface proxy = (Interface)Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{Interface.class},
                new DynamicProxyHandler(real));
        consumer(proxy);
    }
    /* Output:
    doSomething
    somethingElse bonobo
    **** proxy: class chapter14.section7.typeinfo.$Proxy0,
    method: public abstract void chapter14.section7.typeinfo.Interface.doSomething(),
    args:null
    doSomething
    **** proxy: class chapter14.section7.typeinfo.$Proxy0,
    method: public abstract void chapter14.section7.typeinfo.Interface.somethingElse(java.lang.String),
    args:[Ljava.lang.Object;@1517365b
      bonobo
    somethingElse bonobo
     */
}

class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("**** proxy: " + proxy.getClass() + ", method: " + method + ", args:" + args);
        if (args != null){
            for (Object arg : args) {
                System.out.println("  "+arg);
            }
        }
        return method.invoke(proxied, args);
    }
}