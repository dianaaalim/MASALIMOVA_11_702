package ru.itis.Decorator;

public class FlyingSnake extends Decorator {
    public FlyingSnake(Snake snake) {
        super(snake);
    }

    public void fly() {
        System.out.println("Летает");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}
