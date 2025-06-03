package designPattern.iteratorDesignPattern;

public class BookCollection {

    private final Book[] books = new Book[10];
    private int index = 0;


    public void addBook(Book book){
        if(index < books.length){
            books[index++] = book;

        }
    }

    public Iterator<Book> iterator(){
        return new BookIterator(books);
    }
}
