package training;
class CurrentAccount3 extends BankAccount3 {
    private static final float OVERDRAFT_LIMIT = 1000.0f;

    public CurrentAccount3(int accountNumber, String customerName, float balance) {
        super(accountNumber, customerName, balance);
    }

    @Override
    public void deposit(float amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(float amount) {
        if (amount <= getBalance() + OVERDRAFT_LIMIT) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful. Remaining balance: $" + getBalance());
        } else {
            System.out.println("Exceeded overdraft limit. Withdrawal failed.");
        }
    }

    @Override
    public void calculateInterest() {
        System.out.println("Current accounts do not earn interest.");
    }
}