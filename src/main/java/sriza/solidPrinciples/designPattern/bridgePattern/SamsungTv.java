package sriza.solidPrinciples.designPattern.bridgePattern;

// Step 2 - Concrete implementation: Samsung tv
public class SamsungTv implements Device{
    @Override
    public void turnOff() {
        System.out.println("Samsung TV is OF");

    }

    @Override
    public void turnOn() {
        System.out.println("Samsung TV is ON");
    }
}
