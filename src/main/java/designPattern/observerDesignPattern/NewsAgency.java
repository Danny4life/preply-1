package designPattern.observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject{

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {

        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObserver(String news) {

        for(Observer observer : observers){
            observer.update(news);

        }

    }


    public void publishNews(String news){
        System.out.println("NewsAgency: Publishing news -> " + news);

        notifyObserver(news);

    }
}
