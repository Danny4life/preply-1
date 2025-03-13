package selahattin.oop.classActivity2B;

public class Dog extends Animal{

    String color;

    void bark(){
        System.out.println("Dog is barking");
    }

    @Override
    void makeSound(){
        System.out.println("Dog is making sound");
    }
}
