package ru.itis.OOPmoney;

import java.util.Scanner;

public class Main {

    public static String sum(long rub1, byte cop1, long rub2, byte cop2) {
        byte copSum = (byte) (cop1 + cop2);
        long rubSum = rub1 + rub2;
        if (copSum >= 100) {
            rubSum++;
            copSum %= 100;
        }
        return "Salary sum: " + rubSum + "," + copSum;
    }

    public static String difference(long rub1, byte cop1, long rub2, byte cop2) {
        long difRub = rub1 - rub2;
        byte difCop = (byte)(cop1 - cop2);
        if(difCop < 0 && difRub > 0) {
            difRub--;
            difCop = (byte)(100 + difCop);
            return "money difference: " + difRub + "," + difCop;
        } else {
            return "you are Бомжара";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Money money = new Money(scanner.nextLong(), scanner.nextByte());
        Money salary = new Money(scanner.nextLong(), scanner.nextByte());

        System.out.println(money.toString());

        System.out.println(sum(money.getRubles(), money.getCopiks(), salary.getRubles(), salary.getCopiks()));
        System.out.println(difference(money.getRubles(), money.getCopiks(), salary.getRubles(), salary.getCopiks()));
    }
}
