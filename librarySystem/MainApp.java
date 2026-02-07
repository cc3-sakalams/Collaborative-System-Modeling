package librarySystem;
    
    public class MainApp {

    public static void main(String[] args) {


        Book book = new Book("Atomic Habit", "James Clear");
        Librarian librarian = new Librarian("Ms. Santos");
        Library library = new Library("School Library", book, librarian);

        System.out.println(
            book.getIdentity() + "\n" +
            librarian.getIdentity() + "\n" +
            library.getIdentity() + "\n\n" +
            library.getSummary()
        );
    }
}