package ru.itis;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите коэфиценты");
        System.out.println("Введите a");
        int a = scanner.nextInt();
        System.out.println("Введите b");
        int b = scanner.nextInt();
        System.out.println("Введите c");
        int c = scanner.nextInt();
        if (a!=0 && b!=0 && c!=0){
            System.out.println(a + "x^2 + " + b + "x + " + c);
        }
        if (a == 0) {
            System.out.println( b + "x + " + c);
        }
        if (b == 0) {
            System.out.println(a + "x^2 + " + c);
        }
        if (c == 0) {
            System.out.println(a + "x^2 + " + b + "x");
        }
        if (a == 0 && b == 0){
            System.out.println(c);
        }
        if (a == 0 && c == 0){
            System.out.println(b + "x");
        }
        if (b == 0 && c == 0){
            System.out.println(a + "x^2");
        }
    }
}
