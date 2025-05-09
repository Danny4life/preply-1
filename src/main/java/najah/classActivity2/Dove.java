package najah.classActivity2;

public class Dove extends Animal {

    public Dove(String name) {
        super(name);
    }

    @Override
    void makeSound(){
        System.out.println("Dove is whistling...");
    }


}
