package designPattern.bridgeDesignPattern;

public class LGTv implements Device{
    @Override
    public void turnOn() {
        System.out.println("LG TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("LG TV is OFF");
    }
}
