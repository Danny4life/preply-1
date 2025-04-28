package designPattern.builderPattern.classActivity2;

public class Main {

    public static void main(String[] args) {


        Computer newComputer = new Computer.Builder("Intel i7", "16GG")
                .storage("1TB SSD")
                .graphicsCard(true)
                .build();

        System.out.println(newComputer);


        Computer gamingCom = new Computer.Builder("HP", "300gb")
                .graphicsCard(true)
                .storage("2TB")
                .build();

        System.out.println(gamingCom);
    }
}
