package ru.itis;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку(a, b ,c ,d ,e, f, g, h)");
        char n = scanner.next().charAt(0); // B
        System.out.println("Введите столбец(1, 2, 3, 4, 5, 6, 7, 8)");
        char k = scanner.next().charAt(0);
        if ((n + k) % 2 == 0) {
            System.out.println("BLACK");
        } else {
            System.out.println("WHITE");
        }
    }
}
