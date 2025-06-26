package designPattern.visitorDesignPattern;

public interface FileSystemElement {
    void accept(Visitor visitor);
}
