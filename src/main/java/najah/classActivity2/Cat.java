package najah.classActivity2;

public class Cat extends Animal{


    public Cat(String name) {
        super(name);
    }

    @Override
    void makeSound(){
        System.out.println("Cat is meowing....");
    }

}
