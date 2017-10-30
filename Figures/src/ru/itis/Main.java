package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Square square1 = new Square(2);
        Rectangle rectangle1 = new Rectangle(3, 4);
        System.out.println("square" + " " + square1.perimeter() + " " + square1.area());
        System.out.println("rec" + " " + rectangle1.perimeter() + " " + rectangle1.area());

//        Figure figure[] = {rectangle1, square1};
//        for (Figure figures : figure) {
//            System.out.println(figures.perimeter() + " " + figures.area());
//        }
        Circle circle1 = new Circle(7);
        Ellipse ellipse1 = new Ellipse(2, 5);
        System.out.println("cir" + " " + circle1.perimeter() + " " + circle1.area());
        System.out.println("ellip" + " " + ellipse1.perimeter() + " " + ellipse1.area());

    }
}
