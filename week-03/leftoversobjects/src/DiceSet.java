import java.util.Arrays;

public class DiceSet {

    // You have a `DiceSet` class which has a list for 6 dices
// You can roll all of them with roll()
// Check the current rolled numbers with getCurrent()
// You can reroll with reroll()
// Your task is to roll the dices until all of the dices are 6
   static int[] dices = new int[100];


    public int[] roll() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6) + 1;
        }
        return dices;
    }

    public int[] getCurrent() {
        return dices;
    }

    public int getCurrent(int i) {
        return dices[i];
    }

    public void reroll() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6) + 1;
        }
    }

    public void reroll(int k) {
        dices[k] = (int) (Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        DiceSet diceSet = new DiceSet();
        diceSet.getCurrent();
        diceSet.roll();
        diceSet.getCurrent();
        diceSet.getCurrent(5);
        diceSet.reroll();
        diceSet.getCurrent();
        diceSet.reroll(4);
        diceSet.getCurrent();
        int countRolls = 0;
        for (int i = 0; i < 100; i++) {

            while (dices[i] != 6) {
                diceSet.reroll(i);
                countRolls++;
            }
            //System.out.println(dices[i]);
            //System.out.println(countRolls);
        }
        System.out.println(countRolls/100.0);
    }
}