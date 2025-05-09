package designPattern.decoratorDesignPattern;

public class Main {

    public static void main(String[] args) {

        Pizza pizza = new PlainPizza(); // Start with base pizza
        pizza = new CheeseDecorator(pizza); // Adding cheese
        pizza = new TomatoDecorator(pizza); // Adding tomato


        System.out.println("Description: " + pizza.getDescription());
        System.out.println("Total Cost: $" + pizza.getCost());
    }
}
