package ru.itis;

import java.time.LocalTime;
import java.util.Arrays;

public class ParkingPlace {
    private String place;
    private int count = 0;
    private int maxCount = 3;
    private Transport[] transportPlaces = new Transport[maxCount];
    private LocalTime beginTime;
    private LocalTime finishTime;

    public ParkingPlace(String place, LocalTime beginTime, LocalTime finishTime) {
        this.place = place;
        this.transportPlaces = new Transport[maxCount];
        this.beginTime = beginTime;
        this.finishTime = finishTime;
    }

    public ParkingPlace(String place) {
        setPlace(place);
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void addCarToParking(Transport transport) {
        if (LocalTime.now().isBefore(finishTime) && LocalTime.now().isAfter(beginTime)) {
            int i = 0;
            if (count < maxCount) {
                while (transportPlaces[i] != null) {
                    i++;
                }
                transportPlaces[i] = transport;
                count++;
                System.out.print(transport.getTransportColor() + " " + transport.getTransportModel());
//                System.out.print(car.getCarNumber() + " и мощностью = " + car.getCarPower());
                System.out.print(" заехала на парковку " + getPlace());
                System.out.println(" и потратила " + transport.spendFuel() + " литров за время пути");
            } else {
                System.out.println("На парковке больше нет места");
            }
        } else {
            System.out.println("Парковка не работает");
        }

    }

    public void removeCarFromParking(Transport transport) {
        if (LocalTime.now().isBefore(finishTime) && LocalTime.now().isAfter(beginTime)) {
            int pos = 0;
            for (Transport i : transportPlaces) {
                if (i != null && i.equals(transport)) {             //equals сравнение объектов
                    break;
                }
                pos++;
            }
            if (pos >= maxCount) {
                System.out.println("Данная машина не находиться на парковке");
            } else {
                transportPlaces[pos] = null;
                count--;
                System.out.println(transport.getTransportColor() + " " + transport.getTransportModel() + " уехала с парковки " + getPlace());
//                System.out.print(car.getCarNumber() + " и мощностью = " + car.getCarPower());
            }
        } else {
            System.out.println("Парковка не работает");
        }
    }

    public void printCarPlaces() {
        System.out.println(Arrays.toString(transportPlaces));
    }

    @Override
    public String toString() {
        return "ParkingPlace{" +
                "place='" + place + '\'' +
                ", count=" + count +
                ", maxCount=" + maxCount +
                ", carPlaces=" + Arrays.toString(transportPlaces) +
                ", beginTime=" + beginTime +
                ", finishTime=" + finishTime +
                '}';

    }
}

