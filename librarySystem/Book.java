package librarySystem;

    public class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    public String getDetails() {
        return "Book Title: " + title + ", Author: " + author;
    }
    
    public String getIdentity() {
        return "Book Record: Conatains title information";
    }
}
