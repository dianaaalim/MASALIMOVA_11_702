package util;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtil {
    public static int[] first(Scanner scanner, int[]array) {
        System.out.print("Введите кол-во элементов в массиве: ");
        int arraySize = scanner.nextInt();
        if(arraySize > 0) {
            array = new int[arraySize];
            System.out.println("Массив создан");
        } else {
            System.out.println("Неверный размер массива!");
        }
        return array;
    }

    public static int[] second(Scanner scanner, int[] array) {
        boolean checker = true;
        if(array != null) {
            System.out.println("Введите число: ");
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    array[i] = scanner.nextInt();
                    checker = false;
                    break;
                }
            }
            if(checker) {
                int[] newArray = new int[array.length + 1];
                for (int i = 0; i < array.length; i++) {
                    newArray[i] = array[i];
                }
                newArray[array.length] = scanner.nextInt();
                array = newArray;
            }
            System.out.println("Число успешно добавлено");
        }else {
            System.out.println("Массив не создан!!!");
        }
        return array;
    }

    public static int[] third(Scanner scanner, int[] array) {
        if(array != null) {
            System.out.print("Введите позицию: ");
            int index = scanner.nextInt();
            if(index >= 0 && index <= array.length - 1) {
                for (int i = index; i < array.length - 1; i++) {
                    array[i] = array[i + 1];
                }
                array[array.length-1] = 0;
                System.out.println("Число успешно удалено");
            }else {
                System.out.println("Неверная позиция в массиве!");
            }
        }else {
            System.out.println("Массив не создан!!!");
        }
        return array;
    }

    public static int[] fourth(Scanner scanner, int[] array) {
        if(array != null) {
            System.out.print("Введите позицию: ");
            int index = scanner.nextInt();
            int[] newArray;
            if(index < 0) {
                System.out.println("Позиция меньше 0!");
                return array;
            }
            if(index > array.length) {
                System.out.print("Введите число: ");
                newArray = new int[index + 1];
                for(int i = 0; i < array.length; i++) {
                    newArray[i] = array[i];
                }
                newArray[index] = scanner.nextInt();
            } else {
                System.out.print("Введите число: ");
                newArray = new int[array.length + 1];
                for (int i = 0; i < index ; i++) {
                    newArray[i] = array[i];
                }
                newArray[index] = scanner.nextInt();
                for (int i = index; i < array.length; i++) {
                    newArray[i + 1] = array[i];
                }
            }
            array = newArray;
            System.out.println(String.format("Число добавлено на позицию %s", index));
        } else {
            System.out.println("Массив не создан!!!");
        }
        return array;
    }

    public static void fifth(int[] array) {
        if(array == null) {
            System.out.println("Массив не создан!!!");
        } else {
            System.out.println(Arrays.toString(array));
        }
    }
}
