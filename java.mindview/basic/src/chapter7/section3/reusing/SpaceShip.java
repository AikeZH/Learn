package chapter7.section3.reusing;

/**
 * reusing.SpaceShip.java
 * @author zhanghua
 * @date 2020/8/13
 */
public class SpaceShip extends SpaceShipControls {
    private String name;
    public SpaceShip(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }

    public static void main(String[] args) {
        SpaceShip protector = new SpaceShip("NSEA Protector");
        protector.forward(100);
    }
}
