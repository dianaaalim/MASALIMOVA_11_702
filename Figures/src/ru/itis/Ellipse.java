package ru.itis;

public class Ellipse extends Figure{
    private double r1;
    private double r2;

    public Ellipse(double r1, double r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public double getR1() {
        return r1;
    }

    public double getR2() {
        return r2;
    }
    public double perimeter() {
        return  4 * (3.14 * r1 * r2 + (r1 - r2)) / (r1 + r2);
    }
    public double area() {
        return 3.14 * r1 * r2;
    }


}
