package ishan.abstraction;

public class MyInterfaceImpl implements MyInterface, AnotherInterface{
    @Override
    public void run() {
        System.out.println("I am running");
    }

    @Override
    public String eat() {
        return "I am eating";
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public void myMethod() {

    }
}
