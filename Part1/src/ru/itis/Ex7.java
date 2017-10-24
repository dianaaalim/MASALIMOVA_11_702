package ru.itis;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину первой стороны");
        int a = scanner.nextInt();
        System.out.println("Введите длину второй стороны");
        int b = scanner.nextInt();
        System.out.println("Введите длину третьей стороны");
        int c = scanner.nextInt();
        if ((a+b > c) && (a+c > b) && (b+c > a)) {
            System.out.println("Да, из этих сторон можно построить треугольник");
        } else {
            System.out.println("Нет, из этих сторон нельзя построить треугольник");
        }
    }
}
