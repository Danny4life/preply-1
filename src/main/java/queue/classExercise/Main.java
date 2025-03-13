package queue.classExercise;

import queue.classExercise.enums.MealType;
import queue.classExercise.model.Cafeteria;
import queue.classExercise.model.Students;
import queue.classExercise.service.impl.CafeteriaServiceImpl;

public class Main {
    public static void main(String[] args) {
        Students male1 = new Students("Philip", false, true);
        Students male2 = new Students("Charles", false, true);
        Students female1 = new Students("Mary", true, false);

        Cafeteria cafeteria = new Cafeteria(MealType.FISH_AND_CHIPS);

        CafeteriaServiceImpl cafeteriaService = new CafeteriaServiceImpl();


        cafeteriaService.addStudentToQueue(male1);
        cafeteriaService.addStudentToQueue(female1);
        cafeteriaService.addStudentToQueue(male2);


        System.out.println(cafeteriaService.collectMeal(cafeteria));
    }
}
