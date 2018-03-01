package ru.itis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File owners = new File("C:\\Users\\pc\\Desktop\\MASALIMOVA_11_702\\ShopService\\src\\owners.txt");
        File orders = new File("C:\\Users\\pc\\Desktop\\MASALIMOVA_11_702\\ShopService\\src\\orders.txt");

        Scanner scannerOwners = new Scanner(owners);
        Scanner scannerOrders = new Scanner(orders);
        Scanner scannerCity = new Scanner(System.in);
        Scanner scannerWeight = new Scanner(System.in);

        System.out.println("Введите город");
        String needCity = scannerCity.next();
        System.out.println("Введите вес товара");
        Integer needWeight = scannerWeight.nextInt();
        ShopService shops = new ShopService();

        while(scannerOwners.hasNext()){
            shops.owners.ides.add(scannerOwners.nextInt());
            shops.owners.surnames.add(scannerOwners.next());
            shops.owners.names.add(scannerOwners.next());
            shops.owners.fatherNames.add(scannerOwners.next());
            shops.owners.ages.add(scannerOwners.nextInt());
            shops.owners.cities.add(scannerOwners.next());
        }

        while (scannerOrders.hasNext()){
            shops.orders.idesOrders.add(scannerOrders.nextInt());
            shops.orders.idesOwner.add(scannerOrders.nextInt());
            shops.orders.nameOrders.add(scannerOrders.next());
            shops.orders.weight.add(scannerOrders.nextInt());
        }

        shops.searchCity(needCity);
        System.out.println("________________________________________");
        shops.searchWeight(needWeight);
        System.out.println("________________________________________");
        shops.searchHumanWithMaxCountOrder();

    }
}
