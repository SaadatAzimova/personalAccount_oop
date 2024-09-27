import java.util.ArrayList;

public class PersonalAccount {
    public int accountNumber;
    public String accountHolder;
    public double balance;
    private ArrayList<Amount> transactions;

    //constructor
    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<Amount>();
    }

    public void deposit(double amount) {
        Amount myAmount1 = new Amount(amount, TransactionType.DEPOSIT);
        transactions.add(myAmount1);
        this.balance += amount;
    }

    public void withdraw(double amount) {
        Amount myAmount2 = new Amount(amount, TransactionType.WITHDRAWAL);
        if(amount > balance) {
            System.out.println("Insufficient Balance");
        }
        else {
            transactions.add(myAmount2);
            this.balance -= amount;
        }
    }

    public void printTransactionHistory() {
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