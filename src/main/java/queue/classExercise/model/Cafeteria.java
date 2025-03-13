package queue.classExercise.model;

import queue.classExercise.enums.MealType;

public class Cafeteria {

    private MealType mealType;

    public Cafeteria(MealType mealType) {
        this.mealType = mealType;
    }

    public MealType getMealType() {
        return mealType;
    }
}
