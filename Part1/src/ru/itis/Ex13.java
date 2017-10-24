package ru.itis;

import java.util.Arrays;
import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[6];
        int[] array2 = new int[6];
        int i = 0, j = 0;
        System.out.println("Введите шестизначное число");
        int number = scanner.nextInt();
        while (number > 0) {
            array1[i] = number % 10;
            i++;
            number = number / 10;
        }
        System.out.println(Arrays.toString(array1));
        for (i = 0; i < array1.length; i++) {
            array2[j] =  array1[array1.length - i-1];
            j++;
        }
        System.out.println(Arrays.toString(array2));
        if (Arrays.equals(array1, array2)) {
            System.out.println("Число является палиндромом");
        } else {
            System.out.println("Число не является палиндромом");
        }
    }
}
