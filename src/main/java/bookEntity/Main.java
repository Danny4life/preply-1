package bookEntity;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book(1L, "Animal Farm", "George Orwell", 10);
        Book b2 = new Book(2L, "100 years of solitude", "George George", 20);
        Book b3 = new Book(3L, "Romeo and Juliet", "William Shakespare", 30);
        Book b4 = new Book(4L, "Things fall apart", "Chinua Achebe", 40);
        Book b5 = new Book(5L, "Gifted hands", "Ben Carson", 50);


        Set<Book> books = new HashSet<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        books.add(b1);
        books.add(b3);
        books.add(b5);

        for(Book b : books){
            System.out.println(b);
        }
    }
}
