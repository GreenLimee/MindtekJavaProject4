package src.encapsulation;

public class Book {

    // state
    String author;
    int bookId;
    String language;
    boolean isOriginal;
    boolean isDigital;

    // cons
    public Book(){};
    public Book(String author, int bookId, String language){
        this.author = author;
        this.bookId = bookId;
        this.language = language;
    }
    // methods
    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", bookId=" + bookId +
                ", language='" + language + '\'' +
                ", isOriginal=" + isOriginal +
                ", isDigital=" + isDigital +
                '}';
    }

    }
