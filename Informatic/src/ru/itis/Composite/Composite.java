package ru.itis.Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements MilitaryUnit {

    private List<MilitaryUnit> components  = new ArrayList<>();

    public void  addComponent(MilitaryUnit component) {
        components.add(component);
    }
    @Override
    public void attack() {
        for (MilitaryUnit component : components) {
            component.attack();
        }
    }
}
