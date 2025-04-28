package designPattern.prototypeDesignPattern.classActivity2.withoutPrototype;

public class Main {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        // Manually creating each book
        Book book1 = new Book("Design Patterns", "Eric Gamma", "Content of Design Patterns");

        book1.display();

        Book book2 = new Book("Design Patterns", "Eric Gamma", "Content of Design Patterns");

        book2.display();

        Book book3 = new Book("Design Patterns", "Eric Gamma", "Content of Design Patterns");

        book3.display();

        long end = System.currentTimeMillis();
        System.out.println("Total Time Taken: " + (end - start) / 1000.0 + " Seconds");
    }
}
