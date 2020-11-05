package chapter14.section8.typeinfo;

import util.Null;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.List;

/**
 * Using a dynamic proxy to create a Null Object
 * @author ZhangHua
 * @date 2020/11/5
 */
public class NullRobot {
    public static Robot newNullRobot(Class<? extends Robot> type) {
        return (Robot) Proxy.newProxyInstance(
                Robot.class.getClassLoader(),
                new Class[]{Null.class, Robot.class},
                new NullRobotProxyHandler(type));
    }

    public static void main(String[] args) {
        Robot[] bots = {
                new SnowRemovalRobot("SnowBee"),
                newNullRobot(SnowRemovalRobot.class)
        };
        for (Robot bot : bots) {
            Robot.Test.test(bot);
        }
    }
    /* Output:
    Robot name: SnowBee
    Robot model: SnowBot series 11
    SnowBee can shovel snow
    SnowBee shoveling snow
    SnowBee can chip ice
    SnowBee chipping ice
    SnowBee can clear the roof
    SnowBee clearing roof
    [Null Robot]
    Robot name: SnowRemovalRobot NullRobot
    Robot model: SnowRemovalRobot NullRobot
     */
}
class NullRobotProxyHandler implements InvocationHandler{
    private String nullName;
    private Robot proxied = new NRobot();

    NullRobotProxyHandler(Class<? extends Robot> type) {
        nullName = type.getSimpleName() + " NullRobot";
    }

    private class NRobot implements Null, Robot{
        @Override
        public String name() {
            return nullName;
        }

        @Override
        public String model() {
            return nullName;
        }

        @Override
        public List<Operation> operations() {
            return Collections.emptyList();
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxied, args);
    }
}