public class Amount {
    private double amount;
    private TransactionType transactionType;
    //constructor
    public Amount(double amount, TransactionType transactionType){
    this.amount = amount;
    this.transactionType = transactionType;
}     //getter
public double getAmount(){
    return this.amount;
}
public  TransactionType getTransactionType(){
    return this.transactionType;
}
public String toString(){
    return this.transactionType + ": " + this.amount;
    }
}