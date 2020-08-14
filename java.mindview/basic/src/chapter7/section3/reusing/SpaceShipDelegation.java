package chapter7.section3.reusing;

/**
 * reusing.SpaceShipDelegation.java
 * @author zhanghua
 * @date 2020/8/14
 */
public class SpaceShipDelegation {
    private String name;

    private SpaceShipControls controls = new SpaceShipControls();

    public SpaceShipDelegation(String name){
        this.name = name;
    }
    // Delegation methods
    public void up(int velocity){
        controls.up(velocity);
    }
    public void down(int velocity){
        controls.down(velocity);
    }
    public void left(int velocity){
        controls.left(velocity);
    }
    public void right(int velocity){
        controls.right(velocity);
    }
    public void forward(int velocity){
        controls.forward(velocity);
    }
    public void back(int velocity){
        controls.back(velocity);
    }
    public static void main(String[] args) {
        SpaceShipDelegation protector = new SpaceShipDelegation("NSEA Protector");
        protector.forward(100);
    }
}
