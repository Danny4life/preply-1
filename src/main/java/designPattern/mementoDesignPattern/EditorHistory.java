package designPattern.mementoDesignPattern;

import java.util.Stack;

// The Caretaker
public class EditorHistory {

    private Stack<EditorMemento> history = new Stack<>();

    public void save(EditorMemento memento){

        history.push(memento);

    }


    public EditorMemento undo(){
        if(!history.isEmpty()){
            return history.pop();

        }

        return new EditorMemento("");
    }
}
