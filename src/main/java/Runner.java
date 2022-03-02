public class Runner {

    public static void main(String[] args) {
        FanDuelPlayer newFanDuelPlayer = new FanDuelPlayer("Andrew", 0);

        // add funds
        newFanDuelPlayer.addAmountToBalance(10);

        newFanDuelPlayer.bet();
        newFanDuelPlayer.bet();

        System.out.println(newFanDuelPlayer.getPlayerName() +"'s" + " balance is now " + newFanDuelPlayer.getBalance());
    }
    //DONE Please add a function that can add an amount to a players balance
    //Please add a bet function that deducts from a players balance 50 pounds
    //Please check in the deduct function if the value is <0
    //If it <0 then print out "you are out of money" and set his balance to 0
}
