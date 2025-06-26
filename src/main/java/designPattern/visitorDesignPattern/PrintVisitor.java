package designPattern.visitorDesignPattern;

public class PrintVisitor implements Visitor{

    private int indent = 0;

    private void printIndent(){
        for(int i = 0; i <indent; i++){
            System.out.print(" ");

        }
    }

    @Override
    public void visit(FileElement file) {
        printIndent();
        System.out.println(file.name + "(" + file.size + "KB)");


    }

    @Override
    public void visit(DirectoryElement directory) {
        printIndent();
        System.out.println(directory.name);
        indent++;

        for(FileSystemElement child : directory.getChildren()){
            child.accept(this);

        }
        indent--;

    }
}
