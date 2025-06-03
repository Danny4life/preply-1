package designPattern.commandDesignPattern;

public class Main {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        EditorInvoker invoker = new EditorInvoker();


        invoker.executeCommand(new TypeTextCommand(editor, "Hello"));
        invoker.executeCommand(new TypeTextCommand(editor, " World"));
        System.out.println("Text: " + editor.getText());

        invoker.executeCommand(new DeleteTextCommand(editor, 6));
        System.out.println("After Delete: " + editor.getText());

        invoker.undo();
        System.out.println("After Undo: " + editor.getText());

        invoker.undo();
        System.out.println("After undo: " + editor.getText());

        invoker.undo();
        System.out.println("After undo: " + editor.getText());

    }
}
