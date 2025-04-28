package designPattern.prototypeDesignPattern.classActivity2.withPrototype;

public class Main {

    public static void main(String[] args) {


        long start = System.currentTimeMillis();

        // Create only one Original Book
        Book original = new Book("Design Patterns", "Erich Gamma", "Content of Design Patterns");

        original.display();

        Book clone1 = original.clone();
        clone1.display();

        Book clone2 = original.clone();
        clone2.display();

        Book clone3 = original.clone();
        clone3.display();

        long end = System.currentTimeMillis();
        System.out.println("Total Time Taken (With Cloning): " + (end - start) / 1000.0 + " Seconds");
    }

}
