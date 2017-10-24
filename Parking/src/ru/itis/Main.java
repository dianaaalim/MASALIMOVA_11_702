package ru.itis;

public class Main {

    public static void main(String[] args) {
        ParkingPlace parkingPlace1 = new ParkingPlace("Parking1");

        Car car1 = new Car("BMW", "A213TO", "белая", 400);
        Car car2 = new Car("Lada", "P908HC", "зеленая", 330);
        Car car4 = new Car("Lada", "P908HC", "зеленая", 330);
        Car car5 = new Car("Lada", "P908HC", "зеленая", 330);
        Car car6 = new Car("Lada", "P908HC", "зеленая", 330);
        Car car7 = new Car("Lada", "P908HC", "зеленая", 330);
        parkingPlace1.addCarToParking(car1);
        parkingPlace1.addCarToParking(car2);
        parkingPlace1.addCarToParking(car7);
        parkingPlace1.addCarToParking(car4);
        parkingPlace1.addCarToParking(car5);
        parkingPlace1.addCarToParking(car6);
        parkingPlace1.printCarPlaces();
        parkingPlace1.removeCarFromParking(car1);
        parkingPlace1.removeCarFromParking(car2);
        parkingPlace1.printCarPlaces();
        parkingPlace1.removeCarFromParking(car6);
        parkingPlace1.printCarPlaces();
    }
}

