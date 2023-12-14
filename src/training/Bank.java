package training;

//public class Bank {
//    public static void main(String[] args) {
//        // Create an object for the Account class
//        Account account = new Account("A123456", "Savings", 1000.0);
//
//        // Deposit and withdraw from the account
//        account.deposit(500.0);
//        account.withdraw(200.0);
//
//        // Calculate interest for savings account
//        account.calculateInterest();
//
//        // Display account information
//        System.out.println("Account Information:\n" + account);
//    }
//}

class Bank {
    public static void main(String[] args) {
        // Create a Customer
        Customer customer = new Customer(1, "Anmol", "Mishra", "mishraanmol534@email.com", "7233042959", "Kanpur");

        // Create an Account for the Customer
        Account account = new Account(1001, "Current", 1000.0);

        // Display Customer and Account information
        System.out.println("Customer Information:\n" + customer);
        System.out.println("\nAccount Information:\n" + account);

        // Deposit into the account
        account.deposit(500.0);
        System.out.println("\nAfter Deposit:\n" + account);

        // Withdraw from the account
        account.withdraw(1900.0);
        System.out.println("\nAfter Withdrawal:\n" + account);

        // Calculate and add interest to the account balance
        account.calculateInterest();
        System.out.println("\nAfter Interest Calculation:\n" + account);
    }

    void createAccount(Customer4 customer, String accType, float initialBalance) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
