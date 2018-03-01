package ru.itis;

import java.util.Objects;

public class ShopService {

    Orders orders = new Orders();
    Owners owners = new Owners();

    public void searchCity(String needCity) {
        for (int i = 0; i < this.owners.cities.size(); i++) {
            if (this.owners.cities.get(i).equals(needCity)) {
                owners.repeatedIndexOfCity.add(i);
            }
        }
        for (int i = 0; i < owners.repeatedIndexOfCity.size(); i++) {
            System.out.println(this.owners.names.get(owners.repeatedIndexOfCity.get(i)));
        }
    }

    public void searchWeight(Integer needWeight) {
        for (int i = 0; i < this.orders.weight.size(); i++) {
            if (this.orders.weight.get(i).equals(needWeight)) {
                orders.repeatedIndexOfWeigth.add(i);
            }
        }
        for (int i = 0; i < orders.repeatedIndexOfWeigth.size(); i++) {
            System.out.println(this.orders.nameOrders.get(orders.repeatedIndexOfWeigth.get(i)));
        }
    }

    public void searchHumanWithMaxCountOrder() {
        int allValues[] = new int[owners.ides.size()];
        for (int i = 0; i < allValues.length; i++) {
            allValues[i] = 0;
        }
        for (int i = 0; i < this.owners.ides.size(); i++) {
            for (int j = 0; j < this.orders.idesOrders.size(); j++) {
                if (Objects.equals(owners.ides.get(i), orders.idesOwner.get(j))) allValues[i]++;
            }
        }
        int max = 0;
        for (int i = 0; i < allValues.length; i++) {
            if (max < allValues[i]) {
                max = allValues[i];
            }
        }
        for (int i = 0; i < allValues.length; i ++){
            if (allValues[i] == max) System.out.println(owners.names.get(i));
        }
    }
}
