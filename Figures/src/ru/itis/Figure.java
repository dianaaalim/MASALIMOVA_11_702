package ru.itis;

public class Figure {
    protected  double area;
    protected double perimeter;

    public Figure() {
        this.area = area();
        this.perimeter = perimeter();
    }
    public double area() {
        return 0;
    }
    public double perimeter() {
        return 0;
    }
}
