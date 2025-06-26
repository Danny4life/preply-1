package designPattern.visitorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class DirectoryElement implements FileSystemElement{

    String name;

    List<FileSystemElement> children = new ArrayList<>();


    public DirectoryElement(String name) {
        this.name = name;
    }

    public void add(FileSystemElement element){
        children.add(element);

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }

    public List<FileSystemElement> getChildren(){
        return children;
    }
}
