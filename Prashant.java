import java.util.Scanner;
 public class Prashant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object

        // Taking String input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Taking integer input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Taking double input
        System.out.print("Enter your marks: ");
        double marks = sc.nextDouble();

        // Displaying output
        System.out.println("\n--- User Details ---");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + marks);

        sc.close(); // close scanner
    }
}
