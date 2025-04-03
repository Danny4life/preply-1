package sriza.solidPrinciples.designPattern.bridgePattern;

public class BridgeDesignPatternMain {

    public static void main(String[] args) {

        // Create devices
        Device samsungTv = new SamsungTv();
        Device sonyTv = new SonyTv();

        // Use TV Remote control with different devices
        RemoteControl samsungRemoteControl = new TvRemoteControl(samsungTv);
        RemoteControl sonyRemoteControl = new TvRemoteControl(sonyTv);

        // Turn On devices
        samsungRemoteControl.turnOn();
        sonyRemoteControl.turnOn();

        // Turn OFF devices
        samsungRemoteControl.turnOf();
        sonyRemoteControl.turnOf();

    }
}
