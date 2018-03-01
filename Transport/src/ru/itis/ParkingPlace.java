package ru.itis;

import java.time.LocalTime;

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
                System.out.print(" заехала на парковку " + getPlace());
                System.out.println(" и потратила " + transport.spendFuel() + " литров за время пути");
                if (transport instanceof TractorBeloruuus){
                    System.out.println("и там было " + ((TractorBeloruuus) transport).getAmountPotato() + " кг картошки");
                }
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
                if (i != null && i.equals(transport)) {
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
            }
        } else {
            System.out.println("Парковка не работает");
        }
    }
}

