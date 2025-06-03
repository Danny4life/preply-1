package designPattern.mementoDesignPattern;

// The Memento (snapshot)
public class EditorMemento {

    private final String context;

    public EditorMemento(String context) {
        this.context = context;
    }

    public String getContext() {
        return context;
    }
}
