// Farmer.java
import java.util.Scanner;

class Farmer {
    // Data members
    private String name;
    private int age;
    private String crop;
    private double landSize;  // in acres

    // Method to take input
    public void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Farmer Name: ");
        name = sc.nextLine();

        System.out.print("Enter Farmer Age: ");
        age = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Main Crop: ");
        crop = sc.nextLine();

        System.out.print("Enter Land Size (in acres): ");
        landSize = sc.nextDouble();
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("\n----- Farmer Details -----");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Main Crop  : " + crop);
        System.out.println("Land Size  : " + landSize + " acres");
    }
}

public class FarmerDetails {
    public static void main(String[] args) {
        Farmer f1 = new Farmer();  // create object
        f1.inputDetails();         // take input
        f1.displayDetails();       // display details
    }
}
