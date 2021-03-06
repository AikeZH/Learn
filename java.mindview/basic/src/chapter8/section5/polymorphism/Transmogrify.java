package chapter8.section5.polymorphism;

/**
 * Dynamically changing the behavior of object via composition (the "State" design pattern)
 * @author zhanghua
 * @date 2020/9/3
 */
public class Transmogrify {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
    /* Output:
    HappyActor
    SadActor
     */
}
class Actor{
    public void act() {

    }
}
class HappyActor extends Actor{
    @Override
    public void act() {
        System.out.println("HappyActor");
    }
}

class SadActor extends Actor {
    @Override
    public void act() {
        System.out.println("SadActor");
    }
}

class Stage {
    private Actor actor = new HappyActor();

    public void change() {
        actor = new SadActor();
    }

    public void performPlay() {
        actor.act();
    }
}