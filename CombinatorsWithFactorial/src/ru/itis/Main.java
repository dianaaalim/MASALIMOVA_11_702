package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String str = String.valueOf(num);
        int array[] = new int[str.length()];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = num % 10;
            num = num / 10;
        }

        int s = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    s = s + factorial(array.length - 1 - i);
                }
            }
        }
        System.out.println(s);
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; ) {
            fact = i * fact;
            i++;
        }
        return fact;
    }
}
