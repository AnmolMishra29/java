package training;
import java.util.Scanner;
public class Bank3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu to create account
        System.out.println("Choose account type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");

        // Assuming user selects option 1 for Savings Account
        int choice = scanner.nextInt();
        BankAccount3 account;

        switch (choice) {
            case 1:
                account = createAccount("Savings");
                break;
            case 2:
                account = createAccount("Current");
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                return;
        }

        // Display Account information
        System.out.println("Account Information:\n" + account);

        // Deposit into the account
        System.out.print("Enter deposit amount: ");
        float depositAmount = scanner.nextFloat();
        account.deposit(depositAmount);
        System.out.println("After Deposit:\n" + account);

        // Withdraw from the account
        System.out.print("Enter withdrawal amount: ");
        float withdrawAmount = scanner.nextFloat();
        account.withdraw(withdrawAmount);
        System.out.println("After Withdrawal:\n" + account);

        // Calculate and add interest for Savings Account
        account.calculateInterest();
        System.out.println("After Interest Calculation:\n" + account);
    }

    // Helper method to create account based on type
    private static BankAccount3 createAccount(String accountType) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter customer name: ");
        String customerName = scanner.next();
        System.out.print("Enter initial balance: ");
        float initialBalance = scanner.nextFloat();

        if (accountType.equals("Savings")) {
            System.out.print("Enter interest rate: ");
            float interestRate = scanner.nextFloat();
            return new SavingsAccount3(accountNumber, customerName, initialBalance, interestRate);
        } else if (accountType.equals("Current")) {
            return new CurrentAccount3(accountNumber, customerName, initialBalance);
        } else {
            System.out.println("Invalid account type. Exiting...");
            System.exit(0);
            return null;  // Unreachable, but required for compilation
        }
    }
}