public class ViratKohali {
    String name;
    int age;
    String team;
    int matches;
    int runs;
    double average;

    // Constructor
    public ViratKohali(String name, int age, String team, int matches, int runs) {
        this.name = name;
        this.age = age;
        this.team = team;
        this.matches = matches;
        this.runs = runs;
        this.average = calculateAverage();
    }

    // Method to calculate batting average
    private double calculateAverage() {
        return (double) runs / matches;
    }

    // Method to display player profile
    public void displayProfile() {
        System.out.println("---- Virat Kohli Player Profile ----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Team: " + team);
        System.out.println("Matches Played: " + matches);
        System.out.println("Total Runs: " + runs);
        System.out.printf("Batting Average: %.2f\n", average);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating an object for Virat Kohli
        ViratKohali kohali = new ViratKohali("Virat Kohli", 36, "India", 275, 13848);
        kohali.displayProfile();
    }
}
