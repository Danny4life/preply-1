package verlaClasses.week4.classActivity3.model;

import verlaClasses.week4.classActivity3.enums.MealType;

public class Cafeteria {

    private MealType mealType;

    public Cafeteria(MealType mealType) {
        this.mealType = mealType;
    }

    public MealType getMealType() {
        return mealType;
    }
}
