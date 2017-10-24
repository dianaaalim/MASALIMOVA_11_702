package ru.itis;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты первой вершины в виде (3 4)");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Введите координаты второй вершины в виде (0 2)");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.println("Введите координаты третьей вершины в виде (6 7)");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double a = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double b = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
        double c = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));

        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Площадь треугольника равна = " + s);
    }
}
