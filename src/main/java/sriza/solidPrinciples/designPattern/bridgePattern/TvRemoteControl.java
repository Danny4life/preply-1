package sriza.solidPrinciples.designPattern.bridgePattern;

// Step 5 -- Concrete Abstraction: A specific type of remote control
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
    void turnOf() {
        System.out.println("Using Remote");
        device.turnOff();
    }
}
