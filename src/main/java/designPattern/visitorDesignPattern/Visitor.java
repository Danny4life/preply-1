package designPattern.visitorDesignPattern;

public interface Visitor {


    void visit(FileElement file);

    void visit(DirectoryElement directory);
}
