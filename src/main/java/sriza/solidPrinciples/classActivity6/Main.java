package sriza.solidPrinciples.classActivity6;

import java.io.Flushable;

public class Main {

    public static void main(String[] args) {

        Bird penguin = new Penguin("penguin");

        penguin.makeSound();

        Flyable flyingBird = new Dove("dove");
        flyingBird.fly();
    }
}
