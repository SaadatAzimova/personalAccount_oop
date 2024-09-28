public class Amount {

//attributes
    private double amount;
    private TransactionType transactionType;

//constructor
    public Amount(double amount, TransactionType transactionType){
        this.amount = amount;
        this.transactionType = transactionType;
    }
//getter
/**Retrieves the amount of the transaction.
 * @return the transaction amount*/
    public double getAmount(){
        return this.amount;
    }
/**Retrieves the type of the transaction.
 * @return the transaction type, either  DEPOSIT or WITHDRAWAL*/
    public  TransactionType getTransactionType(){
        return this.transactionType;
    }
/**Returns a string representation of the transaction.
 * @return a string representation of the transaction, including the transaction type and amount */
    public String toString(){
        return this.transactionType + ": " + this.amount;
    }
}