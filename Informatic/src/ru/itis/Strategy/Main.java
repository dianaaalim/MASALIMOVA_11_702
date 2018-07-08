package ru.itis.Strategy;

public class Main {
    public static void main(String[] args) {

        Player player = new Player();
        player.attack();

        player.findKnife();
        player.putOnAKnife();
        player.attack();

        player.findGun();
        player.putOnAGun();
        player.attack();

    }
}
