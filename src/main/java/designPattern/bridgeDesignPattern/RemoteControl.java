package designPattern.bridgeDesignPattern;

public abstract class RemoteControl {

    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    abstract void turnOn();

    abstract void turnOff();
}
