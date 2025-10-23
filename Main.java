public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book(101, "Java Fundamentals", "Herbert Schildt"));
        lib.addBook(new Book(102, "Effective Java", "Joshua Bloch"));

        lib.addUser(new Student(1, "Saravana Kumar", "ECE"));
        lib.addUser(new Student(2, "Ravi", "CSE"));

        System.out.println("\n--- Library Users ---");
        lib.showAllUsers();

        System.out.println("\n--- Library Books ---");
        lib.showAllBooks();

        System.out.println("\n--- Book Issue & Return ---");
        lib.issueBook(101, 1);
        lib.returnBook(101);
    }
}
