package ru.itis.Adapter;

public class Main {
    public static void main(String[] args) {
        Player player = new Adapter();
        player.toAttack();
        player.toHeal();
    }
}
