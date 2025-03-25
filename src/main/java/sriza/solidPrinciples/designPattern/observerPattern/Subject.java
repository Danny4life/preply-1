package sriza.solidPrinciples.designPattern.observerPattern;

public interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(String news);
}
