package designPattern.iteratorDesignPattern;

public class BookIterator implements Iterator<Book>{

    private final Book[] books;

    private int position;

    public BookIterator(Book[] books) {
        this.books = books;
        this.position = 0;
    }

    @Override
    public boolean hashNext() {
        return position < books.length && books[position] != null;
    }

    @Override
    public Book next() {
        return books[position++];
    }
}
