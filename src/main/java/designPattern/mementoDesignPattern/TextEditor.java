package designPattern.mementoDesignPattern;

// The Originator
public class TextEditor {

    private String content = "";

    public void write(String text){
        content += text;

    }

    public EditorMemento save(){
        return new EditorMemento(content);
    }

    public void restore(EditorMemento memento){
        this.content = memento.getContext();

    }

    public void showContent(){
        System.out.println(" Editor Content: " + content);
    }
}
