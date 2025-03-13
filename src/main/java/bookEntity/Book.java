package bookEntity;

public class Book {

    private Long id;
    private String bookTitle;

    private String bookAuthor;

    private int qty;

    public Book(Long id, String bookTitle, String bookAuthor, int qty) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.qty = qty;
    }

    public Long getId() {
        return id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getQty() {
        return qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", qty=" + qty +
                '}';
    }
}
