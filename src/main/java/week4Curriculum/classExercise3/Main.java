package week4Curriculum.classExercise3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Book> bookHashMap = new HashMap<>();

        Book book1 = new Book(1, "things fall apart", "chinua achebe", 20);
        Book book2 = new Book(2, "the man died", "wole soyinka", 10);
        Book book3 = new Book(3, "half of a yellow sun", "chimaamanda adichie", 30);
        Book book4 = new Book(4, "animal farm", "george orwell", 5);
        Book book5 = new Book(5, "romeo and juliet", "william shakespare", 15);

        bookHashMap.put(1, book1);
        bookHashMap.put(2, book2);
        bookHashMap.put(3, book3);
        bookHashMap.put(4, book4);
        bookHashMap.put(5, book5);

        for(Map.Entry m : bookHashMap.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
