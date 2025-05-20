package week4Curriculum.classActivity3;

import week4Curriculum.classActivity3.enums.MealType;
import week4Curriculum.classActivity3.model.Cafeteria;
import week4Curriculum.classActivity3.model.Devs;
import week4Curriculum.classActivity3.service.impl.CafeteriaServiceImpl;

public class Main {
    public static void main(String[] args) {
        // Create some sample devs (male and female)


        Devs male1 = new Devs("Philip Efeonah", true, false);
      //  Devs male2 = new Devs("John Efeonah", true, false);
        Devs female1 = new Devs("Janefraces Ibeh", false, true);


        // Create a sample meal
        Cafeteria cafeteria = new Cafeteria(MealType.FRIED_RICE);

        // Create a cafeteria impl instance
        CafeteriaServiceImpl cafeteriaService1 = new CafeteriaServiceImpl();


        // Add male and female devs to the cafeteria queue to request for meal
        cafeteriaService1.addDevsToQueue(male1);
        cafeteriaService1.addDevsToQueue(female1);



        // Run this after to show philip come first with no priority
        // Add male devs to the cafeteria queue to request for meal

//        CafeteriaServiceImpl cafeteriaService2 = new CafeteriaServiceImpl();
//
//        cafeteriaService2.addDevsToQueue(male1);
//        cafeteriaService2.addDevsToQueue(male2);

        // Give out meal

        System.out.println(cafeteriaService1.collectMeal(cafeteria));

//        System.out.println("******Both Males on the queue*******");
//        System.out.println(cafeteriaService2.collectMeal(cafeteria));



    }
}
