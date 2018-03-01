package ru.itis;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    Scanner arraySc = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];

    public static int[] shiftLeft(int[] a, int shift) {
        if (a != null) {
            int length = a.length;
            int[] b = new int[length];
            System.arraycopy(a, shift, b, 0, length - shift);
            System.arraycopy(a, 0, b, length - shift, shift);
            return b;
        } else {
            return null;
        }
    }




}
