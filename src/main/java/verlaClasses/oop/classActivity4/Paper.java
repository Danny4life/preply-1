package verlaClasses.oop.classActivity4;

public class Paper extends Bank implements Print{

    @Override
    void myBank() {
        System.out.println("This is my bank");
    }

    @Override
    public void print() {
        System.out.println("I am printing some money");
    }
}
