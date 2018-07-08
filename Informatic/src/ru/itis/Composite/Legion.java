package ru.itis.Composite;

import java.util.ArrayList;
import java.util.List;

public class Legion implements MilitaryUnit {
    private List<Solder> solders = new ArrayList<>();

    public void addSolder (Solder solder) {
        solders.add(solder);
    }

    @Override
    public void attack() {
        System.out.println("Легион из");
        for (Solder solder : solders) {
            solder.attack();
        }
        System.out.println("___________________");
    }
}
