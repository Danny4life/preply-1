package designPattern.bridgeDesignPattern;

public class SamsungTv implements Device{
    @Override
    public void turnOn() {
        System.out.println("Samsung TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung TV is OFF");
    }
}
