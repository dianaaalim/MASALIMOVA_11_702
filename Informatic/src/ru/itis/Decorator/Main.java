package ru.itis.Decorator;

public class Main {
    private static final int POINTS = 2990;

    public static void main(String[] args) {

        if (POINTS >= 100 &&  POINTS < 200) {
            Snake snake = new FlyingSnake(new SimpleSnake());
            snake.move();
        } else {
            if (POINTS >= 200) {
                Snake snake = new TalkingSnake(new FlyingSnake(new SimpleSnake()));
                snake.move();
            } else {
                Snake snake = new SimpleSnake();
                snake.move();
            }

        }
    }
}
