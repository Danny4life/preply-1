package designPattern.prototypeDesignPattern.classActivity1;

// Concrete Prototypes
public class Soldier implements Unit{

    private String weapon;

    private int health;

    public Soldier(String weapon, int health) {
        this.weapon = weapon;
        this.health = health;
    }

    @Override
    public Unit clone() {
        return new Soldier(this.weapon, this.health);
    }

    public void display(){
        System.out.println("Soldier with " + weapon + " and health " + health);
    }
}
