package queue.classExercise.service.impl;

import queue.classExercise.model.Cafeteria;
import queue.classExercise.model.StudentComparator;
import queue.classExercise.model.Students;
import queue.classExercise.service.CafeteriaService;

import java.util.PriorityQueue;

public class CafeteriaServiceImpl implements CafeteriaService {

    PriorityQueue<Students> studentsOnQueue = new PriorityQueue<>();

    public CafeteriaServiceImpl() {
        studentsOnQueue = new PriorityQueue<>(new StudentComparator());
    }

    @Override
    public void addStudentToQueue(Students students) {
        studentsOnQueue.add(students);
    }

    @Override
    public String collectMeal(Cafeteria mealTaken) {
        if(studentsOnQueue.isEmpty()){
            return "There is no student on the queue";
        }
        Students students = studentsOnQueue.poll();

        return students.getName() + " has taken " + mealTaken.getMealType() + ".";
    }
}
