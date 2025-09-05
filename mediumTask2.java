package mediumTask2;

import java.util.*;

public class mediumTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Map to store category (total expense)
        HashMap<String, Double> expenses = new HashMap<>();

        double totalSpent = 0;
        int choice = 0;

        while (choice != 3) {
            // Menu
            System.out.println("\n--- Personal Expense Tracker ---");
            System.out.println("1. Add Expense");
            System.out.println("2. View Report");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    // Add Expense
                    System.out.print("Enter category (e.g:, Food, Travel, Shopping): ");
                    String category = sc.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();

                    // Update total
                    totalSpent += amount;

                    // Update category
                    if (expenses.containsKey(category)) {
                        double oldValue = expenses.get(category);
                        expenses.put(category, oldValue + amount);
                    } else {
                        expenses.put(category, amount);
                    }

                    System.out.println("Expense added successfully!");
                    break;

                case 2:
                    // Show Report
                    System.out.println("\n--- Expense Report ---");
                    System.out.println("Total Spent: " + totalSpent);

                    if (expenses.isEmpty()) {
                        System.out.println("No expenses recorded yet.");
                    } else {
                        System.out.println("Breakdown by category:");
                        for (Map.Entry<String, Double> entry : expenses.entrySet()) {
                            System.out.println(entry.getKey() + " -> " + entry.getValue());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }

        sc.close();
    }
}
