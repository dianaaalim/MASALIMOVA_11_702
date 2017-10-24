package ru.itis;

import java.util.Arrays;
import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[6];
        System.out.println("Введите шестизначный номер билета");
        int number = scanner.nextInt();
        int i = 0;
        while (number > 0){
            array[i++] = number % 10;
            number = number / 10;
        }
        System.out.println(Arrays.toString(array));
        if ((array[0] + array[2] + array[4] + Math.abs(1) == array[1] + array[3] + array[5]) ||
                (array[0] + array[2] + array[4] == array[1] + array[3] + array[5] + Math.abs(1))) {
            System.out.println("Билет является почти счастливым 'по-питерски'");
        } else {
            System.out.println("Билет не является почти счастливым");
        }
    }
}
