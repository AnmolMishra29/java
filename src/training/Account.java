package training;
public class Account {
    private int accountNumber;
    private String accountType;
    private double accountBalance;

    // Default constructor
    public Account() {
    }

    // Overloaded constructor with Account attributes
    public Account(int accountNumber, String accountType, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    // Getter and setter methods for Account attributes
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    // toString method to print all information of Account attributes
    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
                "\nAccount Type: " + accountType +
                "\nAccount Balance: $" + accountBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        accountBalance += amount;
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: $" + accountBalance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Calculate interest method
    public void calculateInterest() {
        if ("Savings".equalsIgnoreCase(accountType)) {
            double interest = accountBalance * 0.045;
            accountBalance += interest;
            System.out.println("Interest calculated and added. New balance: $" + accountBalance);
        }
    }
}
