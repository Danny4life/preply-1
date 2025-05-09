package designPattern.decoratorDesignPattern;

public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }


    public String getDescription(){
        return pizza.getDescription() + ", Cheese";
    }

    public double getCost(){
        return pizza.getCost() + 1.25;
    }
}
