public class Librarian {

    private String librarianName;

    public Librarian(String librarianName) {
        this.librarianName = librarianName;
    }

    public String getName() {
        return librarianName;
    }

    public String getIdentity() {
        return "Librarian: Assists borrowers";
    }
}
