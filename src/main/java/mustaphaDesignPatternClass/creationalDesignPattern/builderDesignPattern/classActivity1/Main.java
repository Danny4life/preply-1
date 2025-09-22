package mustaphaDesignPatternClass.creationalDesignPattern.builderDesignPattern.classActivity1;

public class Main {

    public static void main(String[] args) {

        // Build a computer with only CPU AND RAM
        Computer basicComputer = new Computer("Intel i5", "8GB");

        // Build a computer with only CPU AND RAM and Storage
        Computer midComputer = new Computer("Intel i5", "8GB", "500GB HDD");

        // Build a full spec computer
        Computer gamingComputer = new Computer("Intel i5", "16GB", "1TB SSD", true);

        System.out.println("Basic computer: " + basicComputer);
        System.out.println("Mid computer: " + midComputer);
        System.out.println("Gaming computer: " + gamingComputer);
    }
}
