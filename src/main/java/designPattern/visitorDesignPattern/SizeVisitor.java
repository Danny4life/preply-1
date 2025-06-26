package designPattern.visitorDesignPattern;

public class SizeVisitor implements Visitor{

    private int totalSize = 0;


    @Override
    public void visit(FileElement file) {
        totalSize += file.size;
    }

    @Override
    public void visit(DirectoryElement directory) {
        for(FileSystemElement child : directory.getChildren()){
            child.accept(this);

        }

    }

    public int getTotalSize(){
        return totalSize;
    }
}
