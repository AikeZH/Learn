package chapter7.section6.reusing;

/**
 * The protected keyword
 *
 * @author zhanghua
 * @date 2020/8/18
 */
public class Orc extends Villain {
    private int orcNumber;

    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }

    public void change(String name, int orcNumber) {
        setName(name);// Available because it's protected
        this.orcNumber = orcNumber;
    }

    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limburger", 12);
        System.out.println(orc);
        orc.change("Bob", 19);
        System.out.println(orc);
    }
    /* Output:
    Orc 12: I'm a Villain and my name is Limburger
    Orc 19: I'm a Villain and my name is Bob
     */
}

class Villain {
    private String name;

    protected void setName(String name) {
        this.name = name;
    }

    public Villain(String name) {
        this.name = name;
    }

    public String toString() {
        return "I'm a Villain and my name is " + name;
    }
}