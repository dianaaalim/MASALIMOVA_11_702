import util.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = null;
        int doing = 0;
        while (doing != 6) {
            System.out.println("1.Создать массив");
            System.out.println("2.Добавить число в конец массива");
            System.out.println("3.Удалить число из массива");
            System.out.println("4.Вставить число в массив");
            System.out.println("5.Вывести массив");
            System.out.println("6.Выход");
            System.out.print("Введите опцию: ");
            doing = scanner.nextInt();
            switch (doing) {
                case 1:
                    array = ArrayUtil.first(scanner, array);
                    break;
                case 2:
                    array = ArrayUtil.second(scanner, array);
                    break;
                case 3:
                    array = ArrayUtil.third(scanner, array);
                    break;
                case 4:
                    array = ArrayUtil.fourth(scanner, array);
                    break;
                case 5:
                    ArrayUtil.fifth(array);
                    break;
                case 6:
                    System.out.println("Удачного дня! Пока :)");
                    break;
                default:
                    System.out.println("Введите корректную операцию");
                    break;
            }
        }
    }
}
