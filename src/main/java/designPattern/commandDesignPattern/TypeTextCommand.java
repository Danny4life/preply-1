package designPattern.commandDesignPattern;

public class TypeTextCommand implements Command{

    private TextEditor editor;
    private String text;


    public TypeTextCommand(TextEditor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    @Override
    public void execute() {
        editor.type(text);
    }

    @Override
    public void undo() {
        editor.deleteLast(text.length());

    }
}
