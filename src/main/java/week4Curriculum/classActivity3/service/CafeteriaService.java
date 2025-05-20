package week4Curriculum.classActivity3.service;

import week4Curriculum.classActivity3.model.Cafeteria;
import week4Curriculum.classActivity3.model.Devs;

public interface CafeteriaService {
    public void addDevsToQueue(Devs devs);

    public String collectMeal(Cafeteria meal);
}
