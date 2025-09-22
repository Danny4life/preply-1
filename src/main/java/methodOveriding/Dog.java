package methodOveriding;

public class Dog extends Animal{ // Child
    @Override
    public String run(String name) {
        return "Dog is running";
    }
}
