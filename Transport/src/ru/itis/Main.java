package ru.itis;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        ParkingPlace parkingPlace = new ParkingPlace("RichParking", LocalTime.parse("00:00:00"), LocalTime.parse("23:00:00"));
        Car car1 = new Car("BMW", "white", 100, 20 );
        parkingPlace.addCarToParking(car1);
        TractorBeloruuus tractor1 = new TractorBeloruuus("Minsk", "black", 500, 10, 100);
        parkingPlace.addCarToParking(tractor1);
        tractor1.amountPotatoes();
        Plane plane1 = new Plane("Ty98", "grey", 1000000, 250);
        parkingPlace.addCarToParking(plane1);
        Tank tank1 = new Tank("T34", "green", 70, 7);
        parkingPlace.addCarToParking(tank1);
        parkingPlace.removeCarFromParking(plane1);
        parkingPlace.addCarToParking(tank1);
        parkingPlace.removeCarFromParking(car1);
        SportCar sportCar1 = new SportCar("RangeRower", "yellow", 4444, 44);
        parkingPlace.addCarToParking(sportCar1);





    }
}
