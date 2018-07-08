package ru.itis.Task1;

public class Adapter extends Artifact implements Character {
    Artifact artifact;

    @Override
    public void toAttack() {
        artifact.action1();
    }

    @Override
    public void toHeal() {
        artifact.action2();
    }
}
