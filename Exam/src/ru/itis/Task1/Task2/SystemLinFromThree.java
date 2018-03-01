package ru.itis.Task1.Task2;

public class SystemLinFromThree {
    private double a1;
    private double a2;
    private double a3;
    private double a4;
    private double a5;
    private double a6;
    private double a7;
    private double a8;
    private double a9;
    private double b1;
    private double b2;
    private double b3;


    public SystemLinFromThree(double a1, double a2, double a3, double a4, double a5, double a6, double a7, double a8, double a9, double b1, double b2, double b3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
        this.a6 = a6;
        this.a7 = a7;
        this.a8 = a8;
        this.a9 = a9;
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
    }

    public String kramer() {
        double det = a1 * a5 * a9 + a2 * a6 * a7 + a4 * a8 * a3 - a3 * a5 * a7 - a1 * a8 * a6 - a2 * a4 * a9;
        double det1 = b1 * a5 * a9 + a2 * a6 * b3 + b2 * a8 * a3 - a3 * a5 * b3 - b1 * a8 * a6 - a2 * b2 * a9;
        double det2 = a1 * b2 * a9 + b1 * a6 * a7 + a4 * b3 * a3 - a3 * b2 * a7 - a1 * b3 * a6 - b1 * a4 * a9;
        double det3 = a1 * a5 * b3 + a2 * b2 * a7 + a4 * a8 * b1 - b1 * a5 * a7 - a1 * a8 * b2 - a2 * a4 * b3;
        double x1 = 0;
        double x2 = 0;
        double x3 = 0;
        if (det != 0) {
                x1 = det1 / det;
                x2 = det2 / det;
                x3 = det3 / det;
        } else {
            System.out.println("Система линейно зависима");
        }
        return "x1=" + x1 +" " + "x2=" + x2 +" "+ "x3=" + x3;
    }

    public void sistema() {
        System.out.println("Система линейных уравнений:");
        System.out.println(a1 + "*x1" + "\t" + a2 + "*x2" + "\t" + a3 + "*x3" + "\t" + "=" + "\t" + b1);
        System.out.println(a4 + "*x1" + "\t" + a5 + "*x2" + "\t" + a6 + "*x3" + "\t" + "=" + "\t" + b2);
        System.out.println(a7 + "*x1" + "\t" + a8 + "*x2" + "\t" + a9 + "*x3" + "\t" + "=" + "\t" + b3);
    }

//    public String triangle() {
//
//    }
}
