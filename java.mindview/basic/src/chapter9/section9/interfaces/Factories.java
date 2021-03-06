package chapter9.section9.interfaces;

/**
 * @author zhanghua
 * @date 2020/9/14
 */
public class Factories {
    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Implementation1Factory());
        // Implementations are completely interchangeable:
        serviceConsumer(new Implementation2Factory());
    }
    /* Output:
    Implementation1 method1
    Implementation1 method2
    Implementation2 method1
    Implementation2 method2
     */
}

interface Service {
    void method1();

    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Implementation1 implements Service {
    // Package access
    Implementation1(){}

    @Override
    public void method1() {
        System.out.println("Implementation1 method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation1 method2");
    }
}

class Implementation1Factory implements ServiceFactory{

    @Override
    public Service getService() {
        return new Implementation1();
    }
}

class Implementation2 implements Service {
    // Package access
    Implementation2() {
    }

    @Override
    public void method1() {
        System.out.println("Implementation2 method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation2 method2");
    }
}

class Implementation2Factory implements ServiceFactory{
    @Override
    public Service getService() {
        return new Implementation2();
    }
}