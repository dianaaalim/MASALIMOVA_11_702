package ru.itis;

import java.util.Arrays;
import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[4];
        int[] array2 = new int[4];
        int cows = 0;
        int bulls = 0;
        int i = 0; int j = 0;
        System.out.println("Загадайте четырехзначное число");
        int number1 = scanner.nextInt();
        System.out.println("Введите предполагаемое число");
        int number2 = scanner.nextInt();
        while (number1 > 0) {
            array1[i++] = number1 % 10;
            number1 = number1 / 10;
        }
        for (i = 0; i < 4; i++) {
            int numberw = number2;
            while (numberw > 0) {
                if (array1[i] == numberw % 10) {
                    cows++;
                }
                numberw = numberw / 10;
            }
        }
        while (number2 > 0) {
            array2[j++] = number2 % 10;
            number2 = number2 / 10;
        }
        for (i = 0; i < 4; i++) {
            if (array1[i] == array2[i]) {
                bulls++;
            }
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println("Количество коров" + " " + (cows - bulls));
    }
}
