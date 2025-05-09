package najah.classActivity2;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    void makeSound(){
        System.out.println("Dog is barking...");
    }


}
