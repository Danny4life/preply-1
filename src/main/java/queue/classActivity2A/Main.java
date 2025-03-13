package queue.classActivity2A;

import classAcitivtiy2B.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        Person p1 = new Person("John", 30);
        Person p2 = new Person("Bob", 25);
        Person p3 = new Person("Charlie", 35);
        Person p4 = new Person("Stark", 20);

        people.add(p1);
        people.add(p2);
        people.add(p4);
        people.add(p3);

        Collections.sort(people, new AgeComparator());

        for(Person persons : people){
            System.out.println(persons.getName() + " - " + persons.getAge());
        }

    }
}
