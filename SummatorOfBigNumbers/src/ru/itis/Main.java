package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        String number1 = scanner.nextLine();
        System.out.println("Введите второе число");
        String number2 = scanner.nextLine();

        int[] arr1 = new int[number1.length()];
        int[] arr2 = new int[number2.length()];
        int length = maxLength(arr1, arr2);
        int[] result = new int[length];

        arr1 = toIntArray(number1);
        print(arr1);
        arr2 = toIntArray(number2);
        print(arr2);
        summator(arr1, arr2, result);
        print(result);

    }

    public static int[] toIntArray(String str) {
        int[] arrayInt = new int[str.length()];
        char[] arrayChar = str.toCharArray();
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = arrayChar[i] - '0';
        }
        return arrayInt;
    }

    public static int maxLength(int[] num1, int[] num2) {
        int maxLength;
        if (num1.length > num2.length) {
            maxLength = num1.length + 1;
        } else {
            maxLength = num2.length + 1;
        }
        return maxLength;
    }

    public static void summator(int[] arr1, int[] arr2, int[] result) {
        int sumLastNum;
        for (int i = result.length - 2; i >= 0; i--) {
            sumLastNum = arr1[i] + arr2[i];
            if (sumLastNum > 9) {
                result[i + 1] += sumLastNum % 10;
                result[i]++;
            } else {
                result[i + 1] = sumLastNum;
            }

        }
    }


    public static void print(int[] array) {
        if (array[0] == 0) {
            for (int i = 1; i < array.length; i++) {
                System.out.print(array[i]);
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
            }
        }
        System.out.println();
    }

}