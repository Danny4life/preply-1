package week4Curriculum.classActivity2.classActivity2b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of Person objects
        List<Person> people = new ArrayList<>();

        Person p1 = new Person("john", 30);
        Person p2 = new Person("bob", 25);
        Person p3 = new Person("charlie", 35);
        Person p4 = new Person("baby", 20);

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        // Sort the list using AgeComparator
        Collections.sort(people, new AgeComparator());

        // Print the sorted list
        for(Person persons : people){
            System.out.println(persons.getName() + " - " + persons.getAge());
        }

    }


    //        List<Integer> num = new ArrayList<>();
//
//        num.add(4);
//        num.add(3);
//        num.add(2);
//        num.add(1);
//
//        Collections.sort(num);
//
//
//        for(Integer nums: num){
//            System.out.println(nums);
//        }
}
