package designPattern.prototypeDesignPattern.classActivity1;

public class Game {

    public static void main(String[] args) {


        Soldier original = new Soldier("Sword", 100);

        Soldier clone1 = (Soldier) original.clone();

        Soldier clone2 = (Soldier) original.clone();


        original.display();

        clone1.display();

        clone2.display();



    }
}
