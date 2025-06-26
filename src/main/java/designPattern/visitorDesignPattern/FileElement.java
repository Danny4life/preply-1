package designPattern.visitorDesignPattern;

public class FileElement implements FileSystemElement{

    String name;
    int size;

    public FileElement(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }
}
