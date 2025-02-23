package Exercise;

import java.util.Scanner;

class FoodOrderingSystem {
    String[] FoodName = {"Burger", "Pizza"};
    double[] Price = {5.99, 8.99};
    int[] quantities = new int[2];

    String customerName, customerAddress;

    void getCustomerInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        customerName = sc.nextLine();
        System.out.print("Enter your address: ");
        customerAddress = sc.nextLine();
    }

    void takeOrder() {
        for (int i = 0; i < 2; i++) {
            System.out.println(i + 1 + " " + FoodName[i] + " " + Price[i]);
        }


        System.out.print("Choose item (1-" + 2 + ", or 0 to finish): ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();


        if (choice < 1 || choice > 2) {
            System.out.println("Invalid choice!");
        }

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        quantities[choice - 1] += quantity;

    }

    void generateBill() {
        double total = 0;
        System.out.println("===== BILL =====");
        System.out.println("Customer: " + customerName);
        System.out.println("Address: " + customerAddress);

        for (int i = 0; i < 2; i++){
            if (quantities[i] > 0) {
                double itemTotal = quantities[i] * Price[i];
                total += itemTotal;
                System.out.println( quantities[i] + " " + FoodName[i] + " " + itemTotal);
            }
        }
        System.out.println("Total Amount: " + total);
    }
}

public class ClassTask01 {
    public static void main(String[] args) {
        //by me
        Scanner sc = new Scanner(System.in);
        FoodOrderingSystem order = new FoodOrderingSystem();

        order.getCustomerInfo();
        order.takeOrder();
        order.generateBill();

        sc.close();
    }
}
