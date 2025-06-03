package designPattern.commandDesignPattern;

public class EditorInvoker {

    private CommandHistory history = new CommandHistory();

    public void executeCommand(Command command){
        command.execute();
        history.push(command);

    }

    public void undo(){
        if(!history.isEmpty()){
            Command lastCommand = history.pop();
            lastCommand.undo();

        }else {
            System.out.println("Nothing to undo");
        }
    }
}
