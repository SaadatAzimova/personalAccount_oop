public class Main {
    public static void main(String[] args) {
        PersonalAccount account1 = new PersonalAccount(230107002, "saadat");
        account1.deposit(300);
        account1.withdraw(150);
        System.out.println(account1.getBalance());
        account1.printTransactionHistory();
        System.out.println(account1.getAccountHolder());
        System.out.println(account1.getAccountNumber());



        PersonalAccount account2 = new PersonalAccount(228715002, "aybike");
        account2.deposit(200);
        account2.withdraw(500);
        System.out.println(account2.getBalance());
        account2.printTransactionHistory();
        System.out.println(account2.getAccountHolder());
        System.out.println(account2.getAccountNumber());



    }
}