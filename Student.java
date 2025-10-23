public class Student extends User {
    private String department;

    public Student(int userId, String name, String department) {
        super(userId, name); // Using super keyword
        this.department = department;
    }

  
    public void displayUser() {
        System.out.println("Student ID: " + userId + " | Name: " + name + " | Department: " + department);
    }
}
