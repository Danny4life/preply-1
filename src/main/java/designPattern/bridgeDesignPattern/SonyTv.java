package designPattern.bridgeDesignPattern;

public class SonyTv implements Device{
    @Override
    public void turnOn() {
        System.out.println("Sony TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony TV is OFF");
    }
}
