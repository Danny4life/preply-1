package week4Curriculum.classActivity1;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String> cityNames = new ArrayList<>();
        cityNames.add("Benin");
        cityNames.add("Ikeja");
        cityNames.add("Awka");
        cityNames.add("Uyo");
        cityNames.add("Enugu");
        cityNames.add("kaduna");

        // iterator to iterate the city name

        Iterator<String> iterator = cityNames.iterator();

        while (iterator.hasNext()){
            String city = iterator.next();
            System.out.println(city);
        }
    }
}
