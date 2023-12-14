package training;
import java.util.Scanner;

abstract class BankAccount3 {
    private int accountNumber;
    private String customerName;
    private float balance;

    // Default constructor
    public BankAccount3() {
    }

    // Overloaded constructor with BankAccount attributes
    public BankAccount3(int accountNumber, String customerName, float balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    // Getter and Setter methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    // Abstract methods
    public abstract void deposit(float amount);

    public abstract void withdraw(float amount);

    public abstract void calculateInterest();

    // toString method
    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
                "\nCustomer Name: " + customerName +
                "\nBalance: $" + balance;
    }
}