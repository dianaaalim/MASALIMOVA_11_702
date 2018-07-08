package ru.itis.Strategy;

public class GunStrategy implements ArmsStrategy {
    @Override
    public void attack() {
        System.out.println("Атака пистолетом");
    }
}
