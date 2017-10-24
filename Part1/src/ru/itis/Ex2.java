package ru.itis;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальную координату фигуры в формате 'b 6' ");
        char letterFirst = scanner.next().charAt(0); // b
        int numberFirst = scanner.nextInt(); // 4
        System.out.println("Введите конечную координату фигуры в формате 'b 6' ");
        char letterSecond = scanner.next().charAt(0); // c
        int numberSecond = scanner.nextInt(); //  7

        System.out.println(letterFirst + "" + numberFirst + "  " + letterSecond + "" + numberSecond);
        if (numberFirst < 8 && letterFirst <= 'h') {
            if (numberFirst == 1) {
                if ((numberSecond - numberFirst == 1 || numberSecond - numberFirst == 2) && letterFirst == letterSecond) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                if (numberSecond - numberFirst == 1 &&letterFirst == letterSecond) {
                    System.out.println("YES");
                } else{
                    System.out.println("NO");
                }
            }
        } else {
            System.out.println("Выход за пределы доски");
        }
    }
}
