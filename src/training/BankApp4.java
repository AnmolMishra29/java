package training;
import java.util.Scanner;
public class BankApp4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. Create Account");
            System.out.println("2. Get Account Balance");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Transfer");
            System.out.println("6. Get Account Details");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createAccount(scanner, bank);
                    break;
                case 2:
                    getAccountBalance(scanner, bank);
                    break;
                case 3:
                    deposit(scanner, bank);
                    break;
                case 4:
                    withdraw(scanner, bank);
                    break;
                case 5:
                    transfer(scanner, bank);
                    break;
                case 6:
                    getAccountDetails(scanner, bank);
                    break;
                case 7:
                    System.out.println("Exiting BankApp. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void createAccount(Scanner scanner, Bank bank) {
        System.out.print("Enter customer's first name: ");
        String firstName = scanner.next();
        System.out.print("Enter customer's last name: ");
        String lastName = scanner.next();
        System.out.print("Enter customer's email address: ");
        String emailAddress = scanner.next();
        System.out.print("Enter customer's phone number: ");
        String phoneNumber = scanner.next();
        System.out.print("Enter customer's address: ");
        String address = scanner.next();

        Customer4 customer = new Customer4(firstName, lastName, emailAddress, phoneNumber, address);

        System.out.println("Choose account type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Enter your choice: ");
        int accTypeChoice = scanner.nextInt();

        String accType;
        switch (accTypeChoice) {
            case 1:
                accType = "Savings";
                break;
            case 2:
                accType = "Current";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Savings Account.");
                accType = "Savings";
        }

        System.out.print("Enter initial balance: ");
        float initialBalance = scanner.nextFloat();

        bank.createAccount(customer, accType, initialBalance);
    }

    private static void getAccountBalance(Scanner scanner, Bank bank) {
        System.out.print("Enter account number: ");
        long accountNumber = scanner.nextLong();
        float balance = bank.getAccountBalance(accountNumber);
        if (balance != -1) {
            System.out.println("Current balance: $" + balance);
        }
    }

    private static void deposit(Scanner scanner, Bank bank) {
        System.out.print("Enter account number: ");
        long accountNumber = scanner.nextLong();
        System.out.print("Enter deposit amount: ");
        float amount = scanner.nextFloat();
        float balance = bank.deposit(accountNumber, amount);
        if (balance != -1) {
            System.out.println("New balance: $" + balance);
        }
    }

    private static void withdraw(Scanner scanner, Bank bank) {
        System.out.print("Enter account number: ");
        long accountNumber = scanner.nextLong();
        System.out.print("Enter withdrawal amount: ");
        float amount = scanner.nextFloat();
        float balance = bank.withdraw(accountNumber, amount);
        if (balance != -1) {
            System.out.println("New balance: $" + balance);
        }
    }

    private static void transfer(Scanner scanner, Bank bank) {
        System.out.print("Enter from account number: ");
        long fromAccountNumber = scanner.nextLong();
        System.out.print("Enter to account number: ");
        long toAccountNumber = scanner.nextLong();
        System.out.print("Enter transfer amount: ");
        float amount = scanner.nextFloat();
        bank.transfer(fromAccountNumber, toAccountNumber, amount);
    }

    private static void getAccountDetails(Scanner scanner, Bank bank) {
        System.out.print("Enter account number: ");
        long accountNumber = scanner.nextLong();
        bank.getAccountDetails(accountNumber);
    }
}