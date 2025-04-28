package designPattern.builderPattern.classActivity1;

public class Computer {

    private String CPU; // Compulsory field

    private String ram; //  Compulsory

    private String storage; // Optional

    private boolean graphicsCard; // Optional

    // Telescoping Constructor
    public Computer(String CPU, String ram) {
        this.CPU = CPU;
        this.ram = ram;
    }

    public Computer(String CPU, String ram, String storage) {
        this(CPU, ram);
        this.storage = storage;
    }


    public Computer(String CPU, String ram, String storage, boolean graphicsCard) {
        this(CPU, ram, storage);
        this.graphicsCard = graphicsCard;
    }


    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", graphicsCard=" + graphicsCard +
                '}';
    }
}
