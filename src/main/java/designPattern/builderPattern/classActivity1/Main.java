package designPattern.builderPattern.classActivity1;

public class Main {

    public static void main(String[] args) {


        // Build a computer with only CPU and RAM

        Computer basicComputer = new Computer("Intel i5", "8GB");


        // Build a computer with CPU, RAM and Storage
        Computer midComputer = new Computer("Intel i5", "8GB", "500GB HDD");

        // Build a full spec computer
        Computer gamingComputer = new Computer("Intel i7", "16GB", "1TB SSD", true);

       // Computer newGenerationComputer = new Computer("Intel i12", true, "36GB", "2TB SSD");

        System.out.println("Basic Computer: " + basicComputer);
        System.out.println("Mid Computer: " + midComputer);
        System.out.println("Gaming Computer: " + gamingComputer);
    }
}
