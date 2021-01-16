package chapter19.section2.enumerated;

/**
 * @author zhanghua
 * @date 2021/1/15
 */
public enum SpaceShip {
    SCOUT, CARGO, TRANSPORT, CRUISER, BATTLESHIP, MOTHERSHIP;

    @Override
    public String toString() {
        String id = name();
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0) + lower;
    }

    public static void main(String[] args) {
        for (SpaceShip item : SpaceShip.values()) {
            System.out.println(item);
        }
    }
    /* Output:
    Scout
    Cargo
    Transport
    Cruiser
    Battleship
    Mothership
     */
}
