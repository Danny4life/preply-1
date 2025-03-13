package oop.classActivity1;

public class Main {

    public static void main(String[] args) {
        // Creating Objects from Car class

        Car toyota = new Car();
        toyota.color = "Red";
        toyota.speed = 120;

        Car bmw = new Car();
        bmw.color = "Blue";
        bmw.speed = 220;


        toyota.showDetails();
        bmw.showDetails();


    }
}
