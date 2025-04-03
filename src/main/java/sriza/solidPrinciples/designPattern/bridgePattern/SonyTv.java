package sriza.solidPrinciples.designPattern.bridgePattern;

public class SonyTv implements Device{
    @Override
    public void turnOff() {
        System.out.println("Sony TV is OF");
    }

    @Override
    public void turnOn() {
        System.out.println("Sony TV is ON");
    }
}
