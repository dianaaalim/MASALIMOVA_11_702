package ru.itis.OOPrationalNums;

import java.util.Scanner;

public class AgainMain {
    public static String difference(RationalNumber firstNum, RationalNumber secondNum) {
        firstNum.setNumerator(firstNum.getIntPart() * firstNum.getDetonator() + firstNum.getNumerator());
        secondNum.setNumerator(secondNum.getIntPart() * secondNum.getDetonator() + secondNum.getNumerator());

        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RationalNumber number1 = new RationalNumber(scanner.nextInt(), scanner.nextInt(), 0);
        RationalNumber number2 = new RationalNumber(scanner.nextInt(), scanner.nextInt(), 0);
        number1.setIntPart(1);
        number1.setNumerator(-1);
        number1.setDetonator(3);
        System.out.println(number1.getIntPart());
        System.out.println(number1.getNumerator());
        System.out.println(number1.getDetonator());
        System.out.println(number1.makingGood());
//        System.out.println(number1.);
    }
}
