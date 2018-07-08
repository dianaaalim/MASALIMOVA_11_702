package ru.itis.Decorator;

public class SimpleSnake implements Snake {
    @Override
    public void move() {
        System.out.println("Ползает");
    }

    public SimpleSnake() {
    }
}
