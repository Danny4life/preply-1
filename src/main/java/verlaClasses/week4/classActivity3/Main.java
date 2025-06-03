package verlaClasses.week4.classActivity3;

import verlaClasses.week4.classActivity3.enums.MealType;
import verlaClasses.week4.classActivity3.model.Cafeteria;
import verlaClasses.week4.classActivity3.model.Devs;
import verlaClasses.week4.classActivity3.service.impl.CafeteriaServiceImpl;

public class Main {

    public static void main(String[] args) {

        Devs male1 = new Devs("John Doe", false, true);
        Devs male2 = new Devs("Mark Doe", false, true);
        Devs female1 = new Devs("Jane Doe", true, false);

        Cafeteria cafeteria = new Cafeteria(MealType.RICE);

        CafeteriaServiceImpl cafeteriaService = new CafeteriaServiceImpl();

        // Add male and female devs to the cafeteria queue to request for meal

        cafeteriaService.addDevsToQueue(male1);
        cafeteriaService.addDevsToQueue(male2);


//        System.out.println("******For priority queue*******");
//        System.out.println(cafeteriaService.collectMeal(cafeteria));


        System.out.println("*****For Both Males on the queue - FIFO");
        System.out.println(cafeteriaService.collectMeal(cafeteria));


    }
}
