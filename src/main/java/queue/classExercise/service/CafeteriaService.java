package queue.classExercise.service;

import queue.classExercise.model.Cafeteria;
import queue.classExercise.model.Students;

public interface CafeteriaService {

    void addStudentToQueue(Students students);

    String collectMeal(Cafeteria mealTaken);
}
