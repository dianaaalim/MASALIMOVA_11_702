package ru.itis.Composite;

import java.util.ArrayList;
import java.util.List;

public class Division implements MilitaryUnit {
    private List<Legion> legions = new ArrayList<>();

    public void addLegion(Legion legion) {
        legions.add(legion);
    }

    @Override
    public void attack() {
        System.out.println("Дивизия из");
        for (Legion legion : legions) {
            legion.attack();
        }
        System.out.println("___________________");
    }
}
