package sriza.solidPrinciples.designPattern.bridgePattern;

// Step 3 -- The abstraction acts as a bridge between the hig-level control and implementation
public abstract class RemoteControl {

    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    abstract void turnOn();
    abstract void turnOf();
}
