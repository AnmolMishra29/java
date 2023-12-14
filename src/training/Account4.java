package training;
class Account4 {
    private static long nextAccountNumber = 1001;

    private final long accountNumber;
    private String accountType;
    private float accountBalance;
    private Customer customer;

    public Account4() {
        this.accountNumber = generateAccountNumber();
    }

    public Account4(String accountType, float accountBalance, Customer customer) {
        this.accountNumber = generateAccountNumber();
        this.accountType = accountType;
        this.accountBalance = accountBalance;
        this.customer = customer;
    }

    // Getter and Setter methods

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
                "\nAccount Type: " + accountType +
                "\nAccount Balance: $" + accountBalance +
                "\nCustomer Details:\n" + customer;
    }

    private long generateAccountNumber() {
        return nextAccountNumber++;
    }
}
