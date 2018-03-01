package ru.itis;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumYdifYend = 0;
        double k;
        double b;
        double r;
        int n = scanner.nextInt();
        double y[] = new double[n];
        double x[] = new double[n];
        double xMPy[] = new double[n];
        double xMPySum = 0;
        double ySum = 0;
        double xSum = 0;
        double xSq[] = new double[n];
        double xSqSum = 0;
        double midY = 0;
        double yDifMidySq[] = new double[n];
        double sumYdifMidy = 0;
        double yEnd[] = new double[n];
        double yDifYend[] = new double[n];

        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            y[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));

        for (int i = 0; i < n; i++) {
            xMPy[i] = x[i] * y[i];
        }
//        for (double i : xMPy) {
//            xMPySum += i;
//        }

        for (int i = 0; i < n; i++) {
            xMPySum += xMPy[i];
        }
//        System.out.println(Arrays.toString(xMPy));

        for (double i : x) {
            xSum += i;           // сумма х
        }
        for (double i: y) {
            ySum += i;           // сумма у
        }
//        for (double i: x) {
//            xSq = Arrays.stream(x).map(operand -> operand * operand).sum();  //сумма квадратов массива
//        }

        for (int i = 0; i < n; i++) {
            xSq[i] = x[i]*x[i];
        }

        for (int i = 0; i < n; i++) {
            xSqSum += xSq[i];
        }

        double sumXsq = xSum*xSum; // квадрат суммы х-ов
//
//        System.out.println(xSum);
//        System.out.println(ySum);
//        System.out.println(xMPySum);
//        System.out.println(xSqSum);
//        System.out.println(sumXsq);

        k = (n*xMPySum - xSum*ySum)/(n*xSqSum - sumXsq);
        System.out .println("k в формуле = " + k);

        b = (xSqSum*ySum - xSum*xMPySum)/(n*xSqSum - sumXsq);
        System.out.println("b в формуле = " + b);

        System.out.println("Уравнение имеет вид: y = " + k + "*x + " + b);

        midY = ySum/n;
//        System.out.println(midY);
        for (int i = 0; i < n; i++) {
            yDifMidySq[i] = Math.pow((y[i] - midY), 2);
        }
        for (double i: yDifMidySq) {
            sumYdifMidy += i;
        }

        System.out.println(Arrays.toString(yDifMidySq));
        System.out.println(sumYdifMidy);

        for (int i = 0; i < n; i++) {
            yEnd[i] = k*x[i] + b;
        }
        for (int i = 0; i < n; i++) {
            yDifYend[i] = Math.pow((y[i] - yEnd[i]), 2);
        }
        for (int i = 0; i < n; i++) {
            sumYdifYend += yDifYend[i];
        }

        System.out.println(Arrays.toString(yDifYend));
        System.out.println(sumYdifYend);

        r = Math.sqrt((sumYdifMidy - sumYdifYend)/(sumYdifMidy));

        System.out.println("Коэффициент корреляции(r) = " + r);
    }
}
