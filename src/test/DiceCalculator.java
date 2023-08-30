package test;

public class DiceCalculator {

    public DiceCalculator() {
    }

    public static int addDice(Dice a, Dice b) {
        return a.getNumber() + b.getNumber();
    }
    public static boolean add(Dice a) {
        if(a.getNumber() % 2 == 0)
            return true;
        else return false;
    }

    public static String getIndexOf(String str, int index) {
        return str.substring(0, index + 1);
    }
}
