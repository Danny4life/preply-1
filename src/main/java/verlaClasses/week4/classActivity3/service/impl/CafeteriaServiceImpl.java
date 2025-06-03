package verlaClasses.week4.classActivity3.service.impl;

import verlaClasses.week4.classActivity3.model.Cafeteria;
import verlaClasses.week4.classActivity3.model.DevComparator;
import verlaClasses.week4.classActivity3.model.Devs;
import verlaClasses.week4.classActivity3.service.CafeteriaService;

import java.util.PriorityQueue;

public class CafeteriaServiceImpl implements CafeteriaService {


    PriorityQueue<Devs> devsOnQueue = new PriorityQueue<>();

    public CafeteriaServiceImpl() {
        devsOnQueue = new PriorityQueue<>(new DevComparator());
    }

    @Override
    public void addDevsToQueue(Devs devs) {
        devsOnQueue.add(devs);

    }

    @Override
    public String collectMeal(Cafeteria meal) {

        if(devsOnQueue.isEmpty()){
            return "No devs is on the queue";

        }

        Devs devs = devsOnQueue.poll();


        return devs.getName() + " has taken " + meal.getMealType() + ".";
    }
}
