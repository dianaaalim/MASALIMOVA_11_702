package ru.itis.Composite;

public class Main {
    public static void main(String[] args) {

        Solder solder1 = new Solder();
        Solder solder2 = new Solder();
        Solder solder3 = new Solder();

        Solder solder4 = new Solder();
        Solder solder5 = new Solder();

        Solder solder6 = new Solder();

        Army army1 = new Army();

        Division division1 = new Division();

        Legion legion1 = new Legion();
        Legion legion2 = new Legion();

        legion1.addSolder(solder1);
        legion1.addSolder(solder2);
        legion1.addSolder(solder3);

        legion2.addSolder(solder4);
        legion2.addSolder(solder5);

        division1.addLegion(legion1);

        army1.addDivision(division1);




        Composite composite = new Composite();

        composite.addComponent(solder6);
        composite.addComponent(army1);
        composite.addComponent(legion2);
        composite.attack();

    }


}
