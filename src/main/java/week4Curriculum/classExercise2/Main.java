package week4Curriculum.classExercise2;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book(1L, "my book", "anonymous", 10);
        Book b2 = new Book(2L, "my book", "anonymous", 10);
        Book b3 = new Book(3L, "my book", "anonymous", 10);
        Book b4 = new Book(4L, "my book", "anonymous", 10);
        Book b5 = new Book(5L, "my book", "anonymous", 10);
        Book b6 = new Book(5L, "my book", "anonymous", 10);



        HashSet<Book> set = new HashSet<>();

        set.add(b1);
        set.add(b2);
        set.add(b3);
        set.add(b4);
        set.add(b5);


        for(Book s : set){
            System.out.println(s);
        }
    }
}
