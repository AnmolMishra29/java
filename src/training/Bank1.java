package training;
class Bank1 {
    public static void main(String[] args) {
        // Display menu to create account
        System.out.println("Choose account type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");

        // Assuming user selects option 1 for Savings Account
        int choice = 2;
        Account1 account;
        switch (choice) {
            case 1:
                account = new SavingsAccount2(1001, 1500.0f, 0.05f);
                break;
            case 2:
                account = new CurrentAccount2(1002, 2000.0f);
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                return;
        }

        // Display Account information
        System.out.println("Account Information:\n" + account);

        // Deposit into the account
        account.deposit(500.0f);
        System.out.println("\nAfter Deposit:\n" + account);

        // Withdraw from the account
        account.withdraw(200.0f);
        System.out.println("\nAfter Withdrawal:\n" + account);

        // Calculate and add interest for Savings Account
        if (account instanceof SavingsAccount2) {
            ((SavingsAccount2) account).calculateInterest();
            System.out.println("\nAfter Interest Calculation:\n" + account);
        }
    }
}