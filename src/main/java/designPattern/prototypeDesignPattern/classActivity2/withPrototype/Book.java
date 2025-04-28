package designPattern.prototypeDesignPattern.classActivity2.withPrototype;

public class Book implements Cloneable {

    private String title;

    private String author;

    private String content;


    public Book(String title, String author, String content) {

        try{
            System.out.println("Loading book: " + title + "...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        this.title = title;
        this.author = author;
        this.content = content;
    }

    public void display(){
        System.out.println(title + " by " + author);
        System.out.println("Content: " + content);
        System.out.println();
    }


    @Override
    public Book clone(){
        try{
            return (Book) super.clone(); //Here is saying give me same copy of the book
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
