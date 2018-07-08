package ru.itis.Adapter;

public class Adapter extends Artifact implements Player {

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
