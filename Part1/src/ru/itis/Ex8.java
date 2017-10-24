package ru.itis;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты первой окружности и радиус в формате (3 4 5)");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double r1 = scanner.nextDouble();
        System.out.println("Введите координаты второй окружности и радиус в формате (5 6 7)");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double r2 = scanner.nextDouble();
        double length = Math.sqrt((Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2)));
        if (length > r1 || length > r2 ) {
            System.out.println("Окружности не пересекаются");
        } else {
            System.out.println("Окружности пересекаются");
        }
    }
}
