public class BankAccount {
    private int balance;


    public BankAccount(int startAmount){
        balance = startAmount;

    }
    //change balance, set balance
    public void doTransaction(int amount){
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return ""+balance;
    }
}
