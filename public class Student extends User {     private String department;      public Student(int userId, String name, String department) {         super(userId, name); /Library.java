import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
        System.out.println("Book added: " + b.getId());
    }

    public void addUser(User u) {
        users.add(u);
        System.out.println("User added: " + u.userId);
    }

    public void issueBook(int bookId, int userId) {
        for (Book b : books) {
            if (b.getId() == bookId) {
                b.issue();
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void returnBook(int bookId) {
        for (Book b : books) {
            if (b.getId() == bookId) {
                b.returnBook();
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void showAllBooks() {
        for (Book b : books) {
            b.displayInfo();
        }
    }

    public void showAllUsers() {
        for (User u : users) {
            u.displayUser();
        }
    }
}
