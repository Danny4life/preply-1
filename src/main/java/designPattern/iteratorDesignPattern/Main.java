package designPattern.iteratorDesignPattern;

public class Main {

    public static void main(String[] args) {

        BookCollection collection = new BookCollection();
        collection.addBook(new Book("Design Patterns"));
        collection.addBook(new Book("Effective Java"));
        collection.addBook(new Book("Clean Code"));


        Iterator<Book> iterator = collection.iterator();

        while (iterator.hashNext()){
            Book book = iterator.next();

            System.out.println("Book Title: " + book.getTitle());
        }
    }
}
