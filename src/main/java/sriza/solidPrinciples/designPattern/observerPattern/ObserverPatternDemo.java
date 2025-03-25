package sriza.solidPrinciples.designPattern.observerPattern;

public class ObserverPatternDemo {
    public static void main(String[] args) {

        // create subject (news agency)
        NewsAgency newsAgency = new NewsAgency();

        // create observers (news channel)
        Observer cnn = new NewsChannel("CNN");
        Observer bbc = new NewsChannel("BBC");

        // Register observers -- subscribed
        newsAgency.addObserver(cnn);
        newsAgency.addObserver(bbc);

        // published news
        newsAgency.publishNews("Breaking News: Observer Pattern Explained");

        newsAgency.removeObserver(cnn);
        newsAgency.publishNews("Latest Update: Java Observer Pattern Explained");

    }
}
