public class Player {
    private String name;
    private BankAccount account;


    private int startPosition = 1;
    private int currentPosition = startPosition;


    public Player(String name, int amount) {
        this.name = name;
        account = new BankAccount(amount);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return account.getBalance();
    }


    @Override
    public String toString() {
        return name +":"+ account;

    }

    public void buy(int cost){

        this.account.doTransaction(-cost);
    }
    public int updatePos(int sum){


        currentPosition = currentPosition + sum;
        if (currentPosition >40){
            currentPosition-=40;
        }
        return currentPosition;
    }

    public int getPosition() {
        return currentPosition;
    }
}