package ru.itis.Task1;

public class Main {

    public static void main(String[] args) {

        Character character = new Adapter();
        character.toAttack();
        character.toHeal();
    }
}
