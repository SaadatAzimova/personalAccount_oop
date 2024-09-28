import java.util.ArrayList;
//ATTRIBUTES
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
//A method to deposit money into the account.

    /**
     * This method creates a new Amount object representing the deposit
     *   transaction and adds it to the list of transactions. The account balance
     *   is then updated by adding the specified amount to the current balance
     *  @param amount the amount to be deposited, must be a positive value
     */
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
        }
        Amount myAmount1 = new Amount(amount, TransactionType.DEPOSIT);
        transactions.add(myAmount1);
        this.balance += amount;
    }
//A method to withdraw money from the account

    /**
     *This method creates a new  Amount object representing the withdrawal
     *transaction and adds it to the list of transactions.
     *@param amount if the withdrawal amount is greater than the current balance and greater than 0,
     */
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
/**A method to print the transaction history of the account*/

    public void printTransactionHistory() {
        System.out.println("Transaction History:");
        for (Amount transaction : transactions) {
            System.out.println(transaction);
        }
    }
/**A method to retrieve the current balance of the account*/
    double getBalance() {
        return this.balance;
    }
/**A method to retrieve the account number*/
    int getAccountNumber() {
        return this.accountNumber;
    }
/**A method to retrieve the account holder's name*/
    String getAccountHolder() {
        return this.accountHolder;
    }

}