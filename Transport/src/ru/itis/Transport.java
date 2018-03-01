package ru.itis;

public class Transport {
    private String transportModel;
    private String transportColor;
    private double way;
    private ParkingPlace parking = null;
    private double fuelConsumption; //расход топлива - постоянный для определенного вида транспорта - скорость 1k/km

    public Transport(String transportModel, String transportColor, double way, double fuelConsumption) {
        this.transportModel = transportModel;
        this.transportColor = transportColor;
        this.fuelConsumption = fuelConsumption;
        this.way = way;
    }

    public double spendFuel() {
      return way/fuelConsumption;
    }

    public double getWay() {
        return way;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public ParkingPlace getParking() {
        return parking;
    }

    public String getTransportModel() {
        return transportModel;
    }

    public String getTransportColor() {
        return transportColor;
    }

}
