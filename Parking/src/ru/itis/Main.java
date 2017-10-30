package ru.itis;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        ParkingPlace parkingPlace1 = new ParkingPlace("P1", LocalTime.parse("00:00:00"), LocalTime.parse("23:00:00"));

        Car car1 = new Car("BMW", "A213TO", "белая", 400);
        Car car2 = new Car("Lada", "P908HC", "зеленая", 330);
        Car car4 = new Car("Mersedes", "P738KM", "черная", 330);
        parkingPlace1.addCarToParking(car1);
        parkingPlace1.addCarToParking(car2);
        parkingPlace1.printCarPlaces();
        parkingPlace1.removeCarFromParking(car1);
        parkingPlace1.removeCarFromParking(car2);
        parkingPlace1.printCarPlaces();
        parkingPlace1.removeCarFromParking(car4);
        parkingPlace1.printCarPlaces();
    }
}

