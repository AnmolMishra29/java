package training;
class SavingsAccount2 extends Account1 {
    private float interestRate;

    public SavingsAccount2(int accountNumber, float accountBalance, float interestRate) {
        super(accountNumber, "Savings", accountBalance);
        this.interestRate = interestRate;
    }

//    SavingsAccount2(int i, float f, float f0) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    //@Override
    public void calculateInterest() {
        float interest = (float) (getAccountBalance() * interestRate);
        deposit(interest);
        System.out.println("Interest calculated and added. New balance: $" + getAccountBalance());
    }
}
