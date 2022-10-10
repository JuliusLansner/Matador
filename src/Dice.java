import java.util.Random;

public class Dice
{


    public static int[] rollDice()
    {
        Random r = new Random();
        int die1 = r.nextInt(6)+1;
        int die2 = r.nextInt(6)+1;
        int[] dieResult = {die1,die2};
        return dieResult;

    }
    public static int rollDiceSum()
    {
        Random r = new Random();
        int die1 = r.nextInt(6)+1;
        int die2 = r.nextInt(6)+1;
        return die1+die2;
    }




}