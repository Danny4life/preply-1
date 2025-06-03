package verlaClasses.week4.classExercise2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//
//        Book b1 = new Book(1L, "Things fall apart", "Chinua Achebe", 1000);
//        Book b2 = new Book(2L, "Half of a yellow sun", "Chimamanda Adichie", 50);
//        Book b3 = new Book(3L, "Animal Farm", "George Orwell", 60);
//        Book b4 = new Book(4L, "Gifted Hands", "Ben Carson", 80);
//        Book b5 = new Book(5L, "Hamlet", "William Shakespeare", 120);
//        Book b6 = new Book(5L, "Hamlet", "William Shakespeare", 120);
//
//
//        HashSet<Book> books = new HashSet<>();
//
//        books.add(b1);
//        books.add(b2);
//        books.add(b3);
//        books.add(b4);
//        books.add(b5);
//        books.add(b6);


        List<String> number = new ArrayList<>();

        number.add("FIVE");
        number.add("FIVE");
        number.add("FIVE");
        number.add("FIVE");
        number.add("FIVE");
        number.add("FIVE");


        Iterator<String> iterator = number.iterator();


        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
