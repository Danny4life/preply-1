package selahattin.oop.classActivity1;

public class Main {

    public static void main(String[] args) {

        Car toyota = new Car(); // object instantiation
        toyota.color = "Red";
        toyota.speed = 200;

        Car bmw = new Car();
        bmw.color = "Blue";
        bmw.speed = 100;

        Car ford = new Car();
        ford.color = "yellow";
        ford.speed = 80;

        toyota.drive();
        bmw.drive();
        ford.drive();


    }
}
