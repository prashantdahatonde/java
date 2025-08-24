 class Cricketer {
    String name;
    int age;
    String role;   // e.g., Batsman, Bowler, All-Rounder, Wicket-Keeper
    int runs;
    int wickets;

    // Constructor
    Cricketer(String name, int age, String role, int runs, int wickets) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.runs = runs;
        this.wickets = wickets;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("----- Cricketer Details -----");
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Role    : " + role);
        System.out.println("Runs    : " + runs);
        System.out.println("Wickets : " + wickets);
    }
}

// Main class
public class CricketerDemo {
    public static void main(String[] args) {
        // Create Cricketer object
        Cricketer c1 = new Cricketer("Virat Kohli", 35, "Batsman", 12000, 4);

        // Display details
        c1.displayDetails();
    }
}
