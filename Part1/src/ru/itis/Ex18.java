package ru.itis;

import java.util.Arrays;
import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[4];
        int[] array2 = new int[4];
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
        while (number2 > 0) {
            array2[j++] = number2 % 10;
            number2 = number2 / 10;
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        for (i = 0; i < 4; i++) {
            if (array1[i] == array2[i]) {
                bulls++;
            }
        }
        System.out.println("Количество быков" + " " + bulls);
    }
}
