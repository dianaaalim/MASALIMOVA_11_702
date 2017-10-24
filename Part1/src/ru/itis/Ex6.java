package ru.itis;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год от 0 до 9999");
        int year = scanner.nextInt();
        if ((year%400 == 0 || year%4 == 0) && year%100 > 0) {
            System.out.println("12/09/" + year);
        } else {
            System.out.println("13/09/" + year);
        }
    }
}
