package training;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Bank4 {
    private Map<Long, Account4> accounts;

    public Bank4() {
        this.accounts = new HashMap<>();
    }

    public void createAccount(Customer customer, String accType, float balance) {
        Account4 account;
        if ("Savings".equalsIgnoreCase(accType)) {
            account = new Account4("Savings", balance, customer);
        } else if ("Current".equalsIgnoreCase(accType)) {
            account = new Account4("Current", balance, customer);
        } else {
            System.out.println("Invalid account type.");
            return;
        }
        accounts.put(account.getAccountNumber(), account);
        System.out.println("Account created successfully. Account Number: " + account.getAccountNumber());
    }

    public float getAccountBalance(long accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            return accounts.get(accountNumber).getAccountBalance();
        } else {
            System.out.println("Account not found.");
            return -1;
        }
    }

    public float deposit(long accountNumber, float amount) {
        if (accounts.containsKey(accountNumber)) {
            Account4 account = accounts.get(accountNumber);
            account.setAccountBalance(account.getAccountBalance() + amount);
            System.out.println("Deposit successful. New balance: $" + account.getAccountBalance());
            return (float) account.getAccountBalance();
        } else {
            System.out.println("Account not found.");
            return -1;
        }
    }

    public float withdraw(long accountNumber, float amount) {
        if (accounts.containsKey(accountNumber)) {
            Account4 account = accounts.get(accountNumber);
            if (amount <= account.getAccountBalance()) {
                account.setAccountBalance(account.getAccountBalance() - amount);
                System.out.println("Withdrawal successful. New balance: $" + account.getAccountBalance());
            } else {
                System.out.println("Insufficient balance. Withdrawal failed.");
            }
            return (float) account.getAccountBalance();
        } else {
            System.out.println("Account not found.");
            return -1;
        }
    }

    public void transfer(long fromAccountNumber, long toAccountNumber, float amount) {
        if (accounts.containsKey(fromAccountNumber) && accounts.containsKey(toAccountNumber)) {
            Account4 fromAccount = accounts.get(fromAccountNumber);
            Account4 toAccount = accounts.get(toAccountNumber);

            if (amount <= fromAccount.getAccountBalance()) {
                fromAccount.setAccountBalance(fromAccount.getAccountBalance() - amount);
                toAccount.setAccountBalance(toAccount.getAccountBalance() + amount);
                System.out.println("Transfer successful.");
            } else {
                System.out.println("Insufficient balance. Transfer failed.");
            }
        } else {
            System.out.println("One or both accounts not found.");
        }
    }

    public void getAccountDetails(long accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            System.out.println(accounts.get(accountNumber));
        } else {
            System.out.println("Account not found.");
        }
    }
}