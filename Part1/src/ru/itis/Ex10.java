package ru.itis;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите коэфиценты квадратного уравнения a*x^2+b*x+c = 0");
        System.out.println("Введите a");
        int a = scanner.nextInt();
        System.out.println("Введите b");
        int b = scanner.nextInt();
        System.out.println("Введите c");
        int c = scanner.nextInt();
        if ((a == 0) && (b == 0) && (c == 0)){
            System.out.println("Корней бесконечно много. Правая часть выражения тождественна левой");
            System.out.println("-1");
        } else {
            if ((Math.pow(b , 2) - (4 * c * a)) < 0) {
                System.out.println("У уравнения нет вещественных корней");
            } else {
                if ((Math.pow(b , 2) - (4 * c * a)) == 0){
                    System.out.println("Уравнение имеет один корень");
                    double x = -b / 2*a;
                    System.out.println("Корень равен " + x);
                } else {
                    System.out.println("Уравнение имеет два корня");
                    double x1 = (-b + Math.sqrt((Math.pow(b , 2) - (4 * c * a))));
                    double x2 = (-b - Math.sqrt((Math.pow(b , 2) - (4 * c * a))));
                    System.out.println(x1 +  " и  "+ x2);

                }
            }
        }
    }
}
