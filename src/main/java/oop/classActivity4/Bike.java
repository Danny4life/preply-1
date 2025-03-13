package oop.classActivity4;

public class Bike extends Vehicle{

    @Override
    void run(){
        System.out.println("Bike is running");
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        Vehicle vehicle = new Vehicle();

        bike.run();
        vehicle.run();
    }
}
