package designPattern.templateDesignPattern;

public abstract class BeverageMaker {

    public final void makeBeverage(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // specific
    protected abstract void addCondiments();

    // specific
    protected abstract void brew();

    // shared
    protected void pourInCup() {
        System.out.println("Pouring into cup...");
    }

    // shared
    protected void boilWater() {
        System.out.println("Boiling water...");
    }
}
