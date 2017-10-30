package ru.itis;

public class TractorBeloruuus extends Transport{
    private double amountPotato;

    public TractorBeloruuus(String transportModel, String transportColor, double way, double fuelConsumption, double amounntPotato) {
        super(transportModel, transportColor, way, fuelConsumption);
        this.amountPotato = amounntPotato;
    }

    public double getAmountPotato() {
        return amountPotato;
    }
    public void amountPotatoes() {
        System.out.println("и там было " + getAmountPotato() + " кг картошки");
    }
}
