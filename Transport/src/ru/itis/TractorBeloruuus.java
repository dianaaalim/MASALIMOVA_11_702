package ru.itis;

public class TractorBeloruuus extends Transport{
    private double amountPotato;

    public TractorBeloruuus(String transportModel, String transportColor, double way, double fuelConsumption, double amountPotato) {
        super(transportModel, transportColor, way, fuelConsumption);
        this.amountPotato = amountPotato;
    }

    public double getAmountPotato() {
        return amountPotato;
    }

    public void Potato() {
        System.out.println("и там было " + getAmountPotato() + " кг картошки");
    }
}
