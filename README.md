package librarySystem;

  public class Library {

    private String name;
    private Book book;              
    private Librarian librarian;

    public Library(String name, Book book, Librarian librarian) {
        this.name = name;
        this.book = book;
        this.librarian = librarian;
    }

    public String getSummary() {
        return name + "\n"
             + book.getDetails() + "\n"
             + "Librarian: " + librarian.getName();
    }

    public String getIdentity() {
        return "Library: Manages books";
    }
}
