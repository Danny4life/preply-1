package mustaphaDesignPatternClass.creationalDesignPattern.builderDesignPattern.classActivity2;

public class Main {
    public static void main(String[] args) {

        Computer newComputer = new Computer.Builder("Intel i7", "16GB")
                .graphicsCard(true)
                .build();

        System.out.println(newComputer);


        Computer gamingComputer = new Computer.Builder("HP", "30gb")
                .graphicsCard(true)
                .storage("")
                .build();

        System.out.println(gamingComputer);
    }






}


