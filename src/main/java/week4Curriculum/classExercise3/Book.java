package week4Curriculum.classExercise3;

public class Book {
    private int id;
    private String bookTitle;
    private String bookAuthor;

    private int qty;

    public Book(int id, String bookTitle, String bookAuthor, int qty) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.qty = qty;
    }

    public int getId() {
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
