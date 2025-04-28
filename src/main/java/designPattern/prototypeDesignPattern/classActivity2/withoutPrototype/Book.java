package designPattern.prototypeDesignPattern.classActivity2.withoutPrototype;

public class Book {

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
}
