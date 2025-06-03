package designPattern.commandDesignPattern;

public class TextEditor {

    private StringBuilder text = new StringBuilder();


    public void type(String input){
        text.append(input);
    }

    public void deleteLast(int length){
        if(length <= text.length()){
            text.delete(text.length() - length, text.length());

        }

    }

    public String getText(){
        return text.toString();
    }
}
