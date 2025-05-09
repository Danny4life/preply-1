package designPattern.bridgeDesignPattern;

public class BridgePatternMain {
    public static void main(String[] args) {


        // Create Devices
        Device samsungTv = new SamsungTv();
        Device sonyTv = new SonyTv();
        Device LGTv = new LGTv();

        // Use TV Remote control with the different devices
        RemoteControl samsungRemote = new TvRemoteControl(samsungTv);
        RemoteControl sonyRemote = new TvRemoteControl(sonyTv);
        RemoteControl lgRemote = new TvRemoteControl(LGTv);



        // Turn ON Devices
        samsungRemote.turnOn();
        sonyRemote.turnOn();
        lgRemote.turnOn();

        // Turn OFF Devices
        samsungRemote.turnOff();
        sonyRemote.turnOff();
        lgRemote.turnOff();
    }
}
