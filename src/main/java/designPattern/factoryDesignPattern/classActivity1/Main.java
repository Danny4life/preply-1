package designPattern.factoryDesignPattern.classActivity1;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(); // Direct instantiation
       // car.start();

        Bike bike = new Bike();
        bike.start();

        Truck truck = new Truck();
        truck.start();

        // 1. it makes our code tightly couple -
        // main class depends directly on the bike and car class
    }
}
