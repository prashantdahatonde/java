import java.util.Scanner;

class Item {
    int id;
    String name;
    double price;
    int quantity;

    // Constructor
    Item(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to display item details
    void displayItem() {
        System.out.println("ID: " + id + ", Name: " + name +
                           ", Price: ₹" + price + ", Quantity: " + quantity);
    }
}

public class Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items in the shop: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Item[] items = new Item[n];

        // Input items
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Item " + (i + 1));
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            items[i] = new Item(id, name, price, quantity);
        }

        
        System.out.println("\n--- Shop Inventory ---");
        for (Item item : items) {
            item.displayItem();
        }

        sc.close();
    }
}
