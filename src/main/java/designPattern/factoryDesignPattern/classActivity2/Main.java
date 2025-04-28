package designPattern.factoryDesignPattern.classActivity2;

public class Main {

    public static void main(String[] args) {


        Vehicle car = VehicleFactory.getVehicle("car");

        car.start();

        Vehicle bike = VehicleFactory.getVehicle("bike");
        bike.start();

        Vehicle truck = VehicleFactory.getVehicle("truck");
        truck.start();


    }
}

/**
 * 1. this promote loose coupling -- The Main class only knows the Vehicle Interface
 */
