package selahattin.oop.classActivity2B;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();

        Cat cat = new Cat();

        Animal animal = new Animal();

        dog.makeSound();
        dog.bark();

        cat.makeSound();
        cat.meow();

        animal.makeSound();
    }
}
