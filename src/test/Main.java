package test;

import java.util.Random;

/**
 * Main 클래스입니다.
 */
public class Main {
    /**
     * main 메서드입니다.
     *
     * @param args input 인자
     */
    public static void main(String[] args) {
        Random r = new Random();
        int random1 = (r.nextInt() * 6) + 1;
        int random2 = (r.nextInt() * 6) + 1;

        Dice first = new Dice(random1);
        Dice second = new Dice(random2);

        System.out.println("주사위 합 = " + DiceCalculator.addDice(first, second));

        String str = "abcdefg";

        int val = (r.nextInt() * str.length());
        System.out.println(DiceCalculator.getIndexOf(str, val));

        int random4 = (r.nextInt() * 6) + 1;
        Dice dice = new Dice(random4);
        System.out.println("주사위 눈(" + random4 + ")이 홀수 : " + DiceCalculator.add(dice));

        try {
            new Library(-1);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
        Library library = new Library(5);

        String str1 = "샬롯의 거미줄";
        library.add(str1);
        library.add("해리포터");
        try {
            library.add(str1);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
        library.delete("해리포터");
        try {
            library.delete("스파이더맨");
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        library.find("str1");
        library.find("샬롯의 거미줄2");

        library.findAll();

        library.add("Java 7");
        library.add("Java 8");
        library.add("Java 9");
        library.add("Java 11");

        library.findAll();
        try {
            library.add("Java 22");
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

    }


}

