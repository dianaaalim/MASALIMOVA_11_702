package ru.itis.Proxy;

import ru.itis.Proxy.Character;

public class MainCharacter implements Character {

    @Override
    public void run() {
        System.out.println("Running");
    }

    @Override
    public void talk() {
        System.out.println("Talking");
    }

    @Override
    public void attac() {
        System.out.println("KIYAAAA");
    }
}
