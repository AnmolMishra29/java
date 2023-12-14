package training;
public class Account1 {
    private int accountNumber;
    private String accountType;
    private float accountBalance;

    public Account1() {
    }

    public Account1(int accountNumber, String accountType, float accountBalance) {
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

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void deposit(float amount) {
        accountBalance += amount;
    }

    public void withdraw(float amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: $" + accountBalance);
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    // Overloaded deposit and withdraw methods
    public void deposit(int amount) {
        deposit((float) amount);
    }

    public void withdraw(int amount) {
        withdraw((float) amount);
    }

    public void deposit(double amount) {
        deposit((float) amount);
    }

    public void withdraw(double amount) {
        withdraw((float) amount);
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
                "\nAccount Type: " + accountType +
                "\nAccount Balance: $" + accountBalance;
    }
}
