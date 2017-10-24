package ru.itis;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальную координату фигуры в формате 'b 6' ");
        char letterFirst = scanner.next().charAt(0); // b
        int numberFirst = scanner.nextInt(); // 4
        System.out.println("Введите конечную координату фигуры в формате 'b 6' ");
        char letterSecond = scanner.next().charAt(0); // c
        int numberSecond = scanner.nextInt(); //  7
        System.out.println(letterFirst + "" + numberFirst + "  " + letterSecond + "" + numberSecond);

        if (letterFirst <= 'h' && numberFirst <= 8 && letterSecond <= 'h' && numberSecond <= 8) {
            if ((letterFirst == letterSecond && numberSecond - numberFirst <= 7) ||
                    (numberFirst == numberSecond && letterSecond - letterFirst <= 8)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("Выход за пределы доски");
        }
    }
}
