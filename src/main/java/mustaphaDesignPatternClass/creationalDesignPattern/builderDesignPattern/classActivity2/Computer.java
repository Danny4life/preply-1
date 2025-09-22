package mustaphaDesignPatternClass.creationalDesignPattern.builderDesignPattern.classActivity2;

public class Computer {
    private String CPU; // Compulsory field

    private String RAM; // Compulsory field

    private String storage; // Optional

    private boolean hasGraphicsCard; // Optional


    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;

    }

    public String getCPU() {
        return CPU;
    }

    public String getRam() {
        return RAM;
    }

    public String getStorage() {
        return storage;
    }

    public boolean isGraphicsCard() {
        return hasGraphicsCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", ram='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", graphicsCard=" + hasGraphicsCard +
                '}';
    }

    public static class Builder{
        private String CPU;

        private String RAM;

        private String storage;

        private boolean hasGraphicsCard;

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder storage(String storage){
            this.storage = storage;
            return this;
        }

        public Builder graphicsCard(boolean value) {
            this.hasGraphicsCard = value;

            return this;
        }

        // This is where the actual object get created
        public Computer build(){
            return new Computer(this);
        }
    }
}
