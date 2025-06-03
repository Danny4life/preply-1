package verlaClasses.week4.classActivity2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();


        Person p2 = new Person("Adult", 70);
        Person p4 = new Person("Child", 50);
        Person p3 = new Person("Adolescent", 60);
        Person p1 = new Person("Elder", 80);



        people.add(p2);
        people.add(p4);
        people.add(p3);
        people.add(p1);


        Collections.sort(people, new AgeComparator());

        for(Person person : people){
            System.out.println(person.getName() + " - " + person.getAge());

        }
    }
}
