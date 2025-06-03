package designPattern.observerDesignPattern;

public class ObserverPatternDemo {

    public static void main(String[] args) {


        // Create subject (NEWS AGENCY)

        NewsAgency newsAgency = new NewsAgency();

        // Create observers (news channels)
        Observer cnn = new NewsChannel("CNN");
        Observer bbc = new NewsChannel("BBC");
        Observer fox = new NewsChannel("FOX");

        // Register Observers
        newsAgency.addObserver(cnn);
        newsAgency.addObserver(bbc);
        newsAgency.addObserver(fox);

        // Publish news
//        newsAgency.publishNews("Breaking News: Observer Pattern Explained!");

        // Unregister BBC from receiving news update and then publish another news
        newsAgency.removeObserver(bbc);

        newsAgency.publishNews("Latest Update: Java Design Patterns In Action!");


    }
}
