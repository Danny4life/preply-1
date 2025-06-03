package verlaClasses.week4.classActivity3.service;

import verlaClasses.week4.classActivity3.model.Cafeteria;
import verlaClasses.week4.classActivity3.model.Devs;

public interface CafeteriaService {

    void addDevsToQueue(Devs devs);

    String collectMeal(Cafeteria meal);
}
