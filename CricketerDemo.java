 class Cricketer {
    String name;
    int age;
    String role;   
    int runs;
    int wickets;

    
    Cricketer(String name, int age, String role, int runs, int wickets) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.runs = runs;
        this.wickets = wickets;
    }

    
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

        /
        c1.displayDetails();/ Display details
    }
}
