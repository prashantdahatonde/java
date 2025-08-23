import java.util.Scanner;
class Accountant {
    
    private int id;
    private String name;
    private double salary;
    private String department;

    // Constructor
    public Accountant(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Method to display accountant details
    public void displayDetails() {
        System.out.println("---- Accountant Details ----");
        System.out.println("ID         : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Salary     : " + salary);
        System.out.println("Department : " + department);
    }
}

public class AccountantDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter Accountant ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Accountant Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine(); // consume newline

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        // Create Accountant object
        Accountant acc = new Accountant(id, name, salary, department);

        // Display details
        acc.displayDetails();

        sc.close();
    }
}
