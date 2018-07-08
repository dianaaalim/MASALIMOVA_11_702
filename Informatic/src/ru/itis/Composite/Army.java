package ru.itis.Composite;

import java.util.ArrayList;
import java.util.List;

public class Army implements MilitaryUnit {

    private List<Division> divisions = new ArrayList<>();

    public void addDivision(Division division) {
        divisions.add(division);
    }

    @Override
    public void attack() {
        System.out.println("Армия из");
        for (Division division : divisions) {
            division.attack();
        }
        System.out.println("___________________");
    }
}
