package ru.itis.Strategy;

public class KnifeStrategy implements ArmsStrategy {
    @Override
    public void attack() {
        System.out.println("Атака ножом");
    }
}
