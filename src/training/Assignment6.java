package training;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment6 {

    public static void main(String[] args) {
        // Initialize transaction history list
        ArrayList<Double> transactions = new ArrayList<>();

        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Main loop
        while (true) {
            // Display menu
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            // Get user choice
            int choice = scanner.nextInt();

            // Process user choice
            switch (choice) {
                case 1:
                    // Deposit
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    transactions.add(depositAmount);
                    break;
                case 2:
                    // Withdraw
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    transactions.add(-withdrawalAmount); // Negative value represents a withdrawal
                    break;
                case 3:
                    // Exit loop
                    printTransactionHistory(transactions);
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }


    static void printTransactionHistory(ArrayList<Double> transactions) {
        System.out.println("\nTransaction History:");
        for (int i = 0; i < transactions.size(); i++) {
            String transactionType = transactions.get(i) >= 0 ? "Deposit" : "Withdrawal";
            System.out.println(transactionType + ": $" + Math.abs(transactions.get(i)));
        }
    }
}
