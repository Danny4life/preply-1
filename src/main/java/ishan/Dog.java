package ishan;

import ishan.abstraction.MyZoo;

public class Dog extends AnimalZoo {


    @Override
    void abstractMethod() {
        System.out.println("I am an abstract method");
    }
}
