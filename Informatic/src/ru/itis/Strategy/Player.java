package ru.itis.Strategy;

public class Player {
    private ArmsStrategy currentStrategy;
    private boolean gunEnabled;
    private boolean knifeEnabled;

    public Player() {
        currentStrategy = new FistStrategy();
    }

    public void putOnAGun() {
        setStrategy(new GunStrategy());
    }

    public void putOnAKnife() {
        setStrategy(new KnifeStrategy());
    }

    private void setStrategy(ArmsStrategy a) {
        if (a instanceof FistStrategy) {
            currentStrategy = a;
//            System.out.println("Кулачки");
        } else if (a instanceof GunStrategy && gunEnabled) {
            currentStrategy = a;
//            System.out.println("Пистолетик");
        } else if (a instanceof KnifeStrategy && knifeEnabled) {
            currentStrategy = a;
//            System.out.println("Ножик");
        } else {
            System.out.println("Нет никакого оружия(((");
        }
    }

    public void findGun() {
        gunEnabled = true;
    }

    public void findKnife() {
        knifeEnabled = true;
    }

    public void attack() {
        currentStrategy.attack();
    }

}
