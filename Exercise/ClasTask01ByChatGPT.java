package Exercise;


import java.util.Scanner;

class FoodOrderingSysteByChatGPT {
private String[] foodNames = {"Burger", "Pizza"};
private double[] prices = {5.99, 8.99};
private int[] quantities = new int[foodNames.length];
private String customerName;
private String customerAddress;

public void takeOrder() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name: ");
    customerName = sc.nextLine();
    System.out.print("Enter your address: ");
    customerAddress = sc.nextLine();

    while (true) {
        displayMenu();
        System.out.print("Choose item (1-" + foodNames.length + ") or 0 to finish: ");
        int choice = sc.nextInt();
        if (choice == 0) {
            break;
        }
        if (choice < 1 || choice > foodNames.length) {
            System.out.println("Invalid choice! Please try again.");
            continue;
        }
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        if (quantity < 1) {
            System.out.println("Quantity must be at least 1. Please try again.");
            continue;
        }
        quantities[choice - 1] += quantity;
    }
}

private void displayMenu() {
    System.out.println("===== MENU =====");
    for (int i = 0; i < foodNames.length; i++) {
        System.out.println((i + 1) + ". " + foodNames[i] + " - $" + prices[i]);
    }
}

public void generateBill() {
    double total = 0;
    System.out.println("\n===== BILL =====");
    System.out.println("Customer: " + customerName);
    System.out.println("Address: " + customerAddress);
    System.out.println("---------------------------------");
    for (int i = 0; i < foodNames.length; i++) {
        if (quantities[i] > 0) {
            double itemTotal = quantities[i] * prices[i];
            System.out.printf("%s x %d = $%.2f%n", foodNames[i], quantities[i], itemTotal);
            total += itemTotal;
        }
    }
    System.out.println("---------------------------------");
    System.out.printf("Total Amount: $%.2f%n", total);
}
}
public class ClasTask01ByChatGPT {
    public static void main(String[] args) {
        FoodOrderingSystem order = new FoodOrderingSystem();
        order.takeOrder();
        order.generateBill();
    }
}
