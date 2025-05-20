package week4Curriculum.classActivity3.model;

import week4Curriculum.classActivity3.enums.MealType;

public class Cafeteria {
    private MealType mealType;

    public Cafeteria(MealType mealType) {
        this.mealType = mealType;
    }

    public MealType getMealType() {
        return mealType;
    }
}
