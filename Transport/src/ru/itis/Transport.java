package ru.itis;

public class Transport {
    private String transportModel;
    private String transportColor;
//    private String transportNumber;
//    private int transportPower;
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

    public void toPark(ParkingPlace parkingPlace) {
        parkingPlace.addCarToParking(this);
    }

    public void toTake(ParkingPlace parkingPlace) {
        parkingPlace.removeCarFromParking(this);
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



//    public void setTransportNumber(String carNumber) {
//        if (transportNumber.length() == 6) {
//            this.transportNumber = transportNumber;
//        }
//        else{
//            this.transportNumber = "A000AA";
//            System.err.println("Неверный формат номера");
//        }
//    }
//    public String getTransportNumber() {
//        return transportNumber;
//    }
//
//    public void setTransportPower(int power) {
//        if (power > 0) {
//            this.transportPower = power;
//        } else {
//            this.transportPower = 0;
//            System.err.println("Неправильное значение");
//            System.err.println("Установлено значение по умолчанию");
//        }
//    }

//    public int getTransportPower() {
//        return transportPower;
//    }

//    @Override
//    public String toString() {
//        return "Машина{" +
//                "Номер машины='" + transportNumber + '\'' +
//                '}';
//    }
}
