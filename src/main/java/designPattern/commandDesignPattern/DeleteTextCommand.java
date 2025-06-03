package designPattern.commandDesignPattern;

public class DeleteTextCommand implements Command{


    private TextEditor editor;

    private String deletedText = "";
    private int numChars;

    public DeleteTextCommand(TextEditor editor, int numChars) {
        this.editor = editor;
        this.numChars = numChars;
    }

    @Override
    public void execute() {
        String current = editor.getText();
        if(current.length() >= numChars){
            deletedText = current.substring(current.length() - numChars);
            editor.deleteLast(numChars);

        }

    }

    @Override
    public void undo() {

        editor.type(deletedText);

    }
}
