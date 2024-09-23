import java.util.ArrayList;

public class PesonalAccount {
    public int accountNumber;
    public String accountHolder;
    public double balance;
    private ArrayList<Amount> transactions;

    //constructor
    public PesonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<Amount>();
    }

    void deposit(double amount) {
        Amount myAmount1 = new Amount(amount, TransactionType.DEPOSIT);
        transactions.add(myAmount1);
        this.balance += amount;
    }

    void withdraw(double amount) {
        Amount myAmount2 = new Amount(amount, TransactionType.WITHDRAWAL);
        transactions.add(myAmount2);
        this.balance -= amount;
    }

    void printTransactionHistory() {
        System.out.println("Transaction History:");
        for (Amount transaction : transactions) {
            System.out.println(transaction);
        }
    }

    double getBalance() {
        return this.balance;
    }

    int getAccountNumber() {
        return this.accountNumber;
    }

    String getAccountHolder() {
        return this.accountHolder;
    }

}