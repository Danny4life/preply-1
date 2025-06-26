package designPattern.templateDesignPattern;

public class CoffeeMaker extends BeverageMaker{
    @Override
    protected void addCondiments() {

        System.out.println("Adding sugar and milk...");

    }

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter...");

    }
}
