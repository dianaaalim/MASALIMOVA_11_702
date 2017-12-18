package ru.itis;

import java.util.ArrayList;
import java.util.Objects;

public class ShopService {
    ArrayList<String> names = new ArrayList<>();
    ArrayList<Integer> ides = new ArrayList<>();
    ArrayList<String> surnames = new ArrayList<>();
    ArrayList<String> fatherNames = new ArrayList<>();
    ArrayList<Integer> ages = new ArrayList<>();
    ArrayList<String> cities = new ArrayList<>();
    ArrayList<Integer> repeatedIndexOfCity = new ArrayList<>();

    ArrayList<Integer> idesOrders = new ArrayList<>();
    ArrayList<Integer> idesOwner = new ArrayList<>();
    ArrayList<String> nameOrders = new ArrayList<>();
    ArrayList<Integer> weight = new ArrayList<>();
    ArrayList<Integer> repeatedIndexOfWeigth = new ArrayList<>();

    ArrayList<Integer> repeatedIndexOfIdesOwner = new ArrayList<>();


    public void searchCity(String needCity) {
        for (int i = 0; i < this.cities.size(); i++) {
            if (this.cities.get(i).equals(needCity)) {
                repeatedIndexOfCity.add(i);
            }
        }
        for (int i = 0; i < repeatedIndexOfCity.size(); i++) {
            System.out.println(this.names.get(repeatedIndexOfCity.get(i)));
        }
    }

    public void searchWeight(Integer needWeight) {
        for (int i = 0; i < this.weight.size(); i++) {
            if (this.weight.get(i).equals(needWeight)) {
                repeatedIndexOfWeigth.add(i);
            }
        }
        for (int i = 0; i < repeatedIndexOfWeigth.size(); i++) {
            System.out.println(this.nameOrders.get(repeatedIndexOfWeigth.get(i)));
        }
    }

    public void searchHumanWithMaxCountOrder() {
        int max[] = new int[ides.size()];
        for (int i = 0; i < max.length; i++) {
            max[i] = 0;
        }
        for (int i = 0; i < this.ides.size(); i++) {
            for (int j = 0; j < this.idesOrders.size(); j++) {
                if (Objects.equals(ides.get(i), idesOwner.get(j))) max[i]++;
            }
        }
        int buf = 0;
        for (int i = 0; i < max.length; i++) {
            if (buf < max[i]) {
                buf = max[i];
            }
        }
        for (int i = 0; i < max.length; i ++){
            if (max[i] == buf) System.out.println(names.get(i));
        }
    }
}
