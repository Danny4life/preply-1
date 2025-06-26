package mustaphaDesignPatternClass.creationalDesignPattern.factoryMethodDesign.classActivity1;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.start();

        Bike bike = new Bike();
        bike.start();

        Truck truck = new Truck();

        truck.start();
    }
}
