package ru.itis.Decorator;

public class Decorator implements Snake {

    Snake snake;

    public Decorator(Snake snake) {
        this.snake = snake;
    }

    @Override
    public void move() {
        snake.move();
    }
}
