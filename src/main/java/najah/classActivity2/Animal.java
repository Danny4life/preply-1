package najah.classActivity2;

public class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void makeSound(){
        System.out.println("Animal is making sound...");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
