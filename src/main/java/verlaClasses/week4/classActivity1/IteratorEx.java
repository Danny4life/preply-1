package verlaClasses.week4.classActivity1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {

    public static void main(String[] args) {

        List<String> cityNames = new ArrayList<>();

        cityNames.add("New York");
        cityNames.add("New York");
        cityNames.add("New York");
        cityNames.add("Brussels");
        cityNames.add("Lagos");
        cityNames.add("Yaounde");
        cityNames.add("London");


        Iterator<String> iterator = cityNames.iterator();

        while (iterator.hasNext()){
            String city = iterator.next();

            System.out.println(city);

        }




    }
}
