package ru.itis;

import java.time.LocalTime;
import java.util.Arrays;

public class ParkingPlace {
    private String place;
    private int count = 0;
    private int maxCount = 5;
    private Car[] carPlaces = new Car[maxCount];
    private LocalTime beginTime = LocalTime.parse("00:00:00");
    private LocalTime finishTime = LocalTime.parse("23:59:59");

    public ParkingPlace(String place) {
        setPlace(place);
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void addCarToParking(Car car) {
        if (LocalTime.now().isBefore(finishTime) && LocalTime.now().isAfter(beginTime)) {
            int i = 0;
            if (count < maxCount) {
                while (carPlaces[i] != null) {
                    i++;
                }
                carPlaces[i] = car;
                count++;
                System.out.print(car.getCarColor() + " " + car.getCarModel() + " с номерами: ");
                System.out.print(car.getCarNumber() + " и мощностью = " + car.getCarPower());
                System.out.println(" заехала на парковку номер " + getPlace());
            } else {
                System.out.println("На парковке больше нет места");
            }
        } else {
            System.out.println("Парковка не работает");
        }

    }

    public void removeCarFromParking(Car car) {
        if (LocalTime.now().isBefore(finishTime) && LocalTime.now().isAfter(beginTime)) {
            int pos = 0;
            for (Car i : carPlaces) {
                if(i != null && i.equals(car)) {             //equals сравнение объектов
                    break;
                }
                pos++;
            }
            if (pos >= maxCount) {
                System.out.println("Данная машина не находиться на парковке");
            } else {
                carPlaces[pos] = null;
                count--;
                System.out.print(car.getCarColor() + " " + car.getCarModel() + "с номерами: ");
                System.out.print(car.getCarNumber() + " и мощностью = " + car.getCarPower());
                System.out.println(" уехала с парковки под номером " + getPlace());
            }
        } else {
            System.out.println("Парковка не работает");
        }
    }

    public void printCarPlaces() {
        System.out.println(Arrays.toString(carPlaces));
    }

    @Override
    public String toString() {
        return "ParkingPlace{" +
                "place='" + place + '\'' +
                ", count=" + count +
                ", maxCount=" + maxCount +
                ", carPlaces=" + Arrays.toString(carPlaces) +
                ", beginTime=" + beginTime +
                ", finishTime=" + finishTime +
                '}';
    }
}
