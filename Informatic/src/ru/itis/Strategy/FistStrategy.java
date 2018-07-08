package ru.itis.Strategy;

public class FistStrategy implements ArmsStrategy {
    @Override
    public void attack() {
        System.out.println("Атака кулаком");
    }
}

