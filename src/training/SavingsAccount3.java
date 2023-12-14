package training;
class SavingsAccount3 extends BankAccount3 {
    private final float interestRate;

    public SavingsAccount3(int accountNumber, String customerName, float balance, float interestRate) {
        super(accountNumber, customerName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(float amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(float amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful. Remaining balance: $" + getBalance());
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    @Override
    public void calculateInterest() {
        float interest = getBalance() * interestRate;
        deposit(interest);
        System.out.println("Interest calculated and added. New balance: $" + getBalance());
    }
}
