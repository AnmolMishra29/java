package training;
class CurrentAccount2 extends Account1 {
    private static final float OVERDRAFT_LIMIT = 1000.0f;

    public CurrentAccount2(int accountNumber, float accountBalance) {
        super(accountNumber, "Current", accountBalance);
    }

    @Override
    public void withdraw(float amount) {
        if (amount <= getAccountBalance() + OVERDRAFT_LIMIT) {
            setAccountBalance((float) (getAccountBalance() - amount));
            System.out.println("Withdrawal successful. Remaining balance: $" + getAccountBalance());
        } else {
            System.out.println("Exceeded overdraft limit. Withdrawal failed.");
        }
    } 

//    private float getAccountBalance() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}