public class FanDuelPlayer {
    private double balance=0.00;
    private String playerName = "";

    public FanDuelPlayer(String inputPlayerName, double initialBalance){
        playerName = inputPlayerName;
        balance = initialBalance;

    }

    public double getBalance() {
        return balance;
    }

    public void addAmountToBalance(double inputAmount) {
        balance += inputAmount;
    }



    public void bet(){
        balance -= 50;
        if (balance < 0){
            System.out.println("You are out of money");
        }
        balance = 0;
    }



    public String getPlayerName(){
        return playerName;
    }
}