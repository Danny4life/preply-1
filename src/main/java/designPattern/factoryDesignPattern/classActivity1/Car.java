package designPattern.factoryDesignPattern.classActivity1;

public class Car {

    public static void main(String[] args) {

        StaticEx.name = "JANE"; // here it still maintains that one memory

        StaticEx obj = new StaticEx();

        obj.myName = "Jude"; // here is another new memory
    }
}
