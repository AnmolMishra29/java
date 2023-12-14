package training;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment4 {

    public static void main(String[] args) {
        // Initialize bank accounts
        Map<String, Double> accounts = new HashMap<>();
        accounts.put("123456", 1000.0);
        accounts.put("789012", 1500.0);
        accounts.put("345678", 2000.0);

        
        Scanner scanner = new Scanner(System.in);

        // Main loop
        while (true) {
            // Ask user for account number
            System.out.print("Enter your account number: ");
            String accountNumber = scanner.nextLine();

            // Validate account number
            if (accounts.containsKey(accountNumber)) {
                // Display account balance
                System.out.println("Your account balance is: $" + accounts.get(accountNumber));
                break; 
            } else {
                // Invalid account number, ask user to try again
                System.out.println("Invalid account number. Please try again.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
