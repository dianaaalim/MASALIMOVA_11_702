package ru.itis;

public class Car {
    int carID;
    String model;
    int id;

    public Car(int carID, String model, int id) {
        this.carID = carID;
        this.model = model;
        this.id = id;
    }

    public int getCarID() {
        return carID;
    }

    public String getModel() {
        return model;
    }

    public int getId() {
        return id;
    }
}
