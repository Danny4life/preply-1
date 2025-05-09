package designPattern.bridgeDesignPattern;

public class TvRemoteControl extends RemoteControl{
    public TvRemoteControl(Device device) {
        super(device);
    }

    @Override
    void turnOn() {
        System.out.println("Using Remote");
        device.turnOn();
    }

    @Override
    void turnOff() {
        System.out.println("Using Remote");
        device.turnOff();
    }
}
