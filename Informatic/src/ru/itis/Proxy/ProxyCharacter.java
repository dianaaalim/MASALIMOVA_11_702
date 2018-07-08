package ru.itis.Proxy;

import ru.itis.Proxy.Character;
import ru.itis.Proxy.MainCharacter;

public class ProxyCharacter implements Character {

    MainCharacter character;

    @Override
    public void run() {
        if (character == null) {
            character = new MainCharacter();
        }
        character.run();

    }

    @Override
    public void talk() {
        if (character == null) {
            character = new MainCharacter();
        }
        character.talk();

    }

    @Override
    public void attac() {
        if (character == null) {
            character = new MainCharacter();
        }
        character.attac();
    }


}
