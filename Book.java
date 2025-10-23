public class Book {
    private int id;
    private String title;
    private String author;
    private boolean issued;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.issued = false;
    }

    public int getId() {
        return id;
    }

    public boolean isIssued() {
        return issued;
    }

    public void issue() {
        if (!issued) {
            issued = true;
            System.out.println(title + " has been issued.");
        } else {
            System.out.println(title + " is already issued.");
        }
    }

    public void returnBook() {
        if (issued) {
            issued = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not issued.");
        }
    }

    public void displayInfo() {
        System.out.println("Book ID: " + id + " | Title: " + title + " | Author: " + author + " | Issued: " + issued);
    }
}
