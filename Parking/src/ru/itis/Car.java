package ru.itis;

public class Car {
    private String carModel;
    private String carColor;
    private String carNumber;
    private int carPower;
    private ParkingPlace parking = null;

    public Car(String carModel, String carColor, String carNumber, int carPower) {
        this.carModel = carModel;
        this.carColor = carColor;
        this.carNumber = carNumber;
        this.carPower = carPower;
    }

    public void toPark(ParkingPlace parkingPlace) {
        parkingPlace.addCarToParking(this);
    }
    public void toTake(ParkingPlace parkingPlace) {
        parkingPlace.removeCarFromParking(this);
    }

    public void setParking(ParkingPlace parking) {
        this.parking = parking;
    }

    public ParkingPlace getParking() {
        return parking;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarNumber(String carNumber) {
        if (carNumber.length() == 6) {
            this.carNumber = carNumber;
        }
        else{
            this.carNumber = "A000AA";
            System.err.println("Неверный формат номера");
        }
    }
    public String getCarNumber() {
        return carNumber;
    }
    
    public void setCarPower(int power) {
        if (power > 0) {
            this.carPower = power;
        } else {
            this.carPower = 0;
            System.err.println("Неправильное значение");
            System.err.println("Установлено значение по умолчанию");
        }
    }

    public int getCarPower() {
        return carPower;
    }

    @Override
    public String toString() {
        return "Машина{" +
                "Номер машины='" + carNumber + '\'' +
                '}';
    }
}
