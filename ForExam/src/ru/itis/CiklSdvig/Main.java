package ru.itis.CiklSdvig;

import ru.itis.CiklSdvig.ArrayToRightLeft;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        array = ArrayToRightLeft.shiftLeft(array, 2);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
