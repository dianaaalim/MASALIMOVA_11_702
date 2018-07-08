package ru.itis.Decorator;

public class TalkingSnake extends Decorator {
    public TalkingSnake(Snake snake) {
        super(snake);
    }

    public void talk() {
        System.out.println("Говорит");
    }

    @Override
    public void move() {
        super.move();
        talk();
    }
}
