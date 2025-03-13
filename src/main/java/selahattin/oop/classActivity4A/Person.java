package selahattin.oop.classActivity4A;

public abstract class Person {

    long id;

    String dateCreated;

    String dateModified;

    String firstName;

    String lastName;

    String color;

    // this is an abstract method -- are methods without body.
    public abstract void run();


    // non abstract method -- it has a body
    public void display(){
        System.out.println("display..");
    }
}
