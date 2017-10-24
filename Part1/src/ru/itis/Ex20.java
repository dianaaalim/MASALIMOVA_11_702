package ru.itis;

import java.util.Arrays;
import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввидите номер первого билета");
        int number1 = scanner.nextInt();
        System.out.println("Введите номер второго билета");
        int number2 = scanner.nextInt();
        int[] array1 = new int[6];
        int[] array2 = new int[6];
        int i = 0;
        int j = 0;
        while (number1 > 0){
            array1[i++] = number1 % 10;
            number1 = number1 / 10;
        }
        System.out.println(Arrays.toString(array1));
        while (number2 > 0){
            array2[j++] = number2 % 10;
            number2 = number2 / 10;
        }
        System.out.println(Arrays.toString(array2));

        if ((array1[0] + array2[0] + array1[1] + array2[1] + array1[2] + array2[2]) ==
                (array1[3] + array2[3] + array1[4] + array2[4] + array1[5] + array2[5])) {
            System.out.println("Поциферная сумма билетов счастлива по-московски");
        } else {
            System.out.println("Поциферная сумма билетов не счастлива по-московски.");
        }
    }
}
