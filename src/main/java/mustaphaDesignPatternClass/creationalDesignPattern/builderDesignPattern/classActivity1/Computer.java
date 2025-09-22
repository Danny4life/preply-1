package mustaphaDesignPatternClass.creationalDesignPattern.builderDesignPattern.classActivity1;

public class Computer {

    private String CPU; // Compulsory field

    private String ram; // Compulsory field

    private String storage; // Optional

    private boolean graphicsCard; // Optional


    // Telescoping Constructor
    public Computer(String CPU, String ram) {
        this.CPU = CPU;
        this.ram = ram;
    }

    public Computer(String CPU, String ram, String storage, boolean graphicsCard) {
       this(CPU, ram);
       this.graphicsCard = graphicsCard;
    }

    public Computer(String intelI5, String s, String s1) {
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
