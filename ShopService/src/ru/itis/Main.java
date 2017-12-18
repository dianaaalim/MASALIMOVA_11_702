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
            shops.ides.add(scannerOwners.nextInt());
            shops.surnames.add(scannerOwners.next());
            shops.names.add(scannerOwners.next());
            shops.fatherNames.add(scannerOwners.next());
            shops.ages.add(scannerOwners.nextInt());
            shops.cities.add(scannerOwners.next());
        }
        while (scannerOrders.hasNext()){
            shops.idesOrders.add(scannerOrders.nextInt());
            shops.idesOwner.add(scannerOrders.nextInt());
            shops.nameOrders.add(scannerOrders.next());
            shops.weight.add(scannerOrders.nextInt());
        }


        shops.searchCity(needCity);
        System.out.println("________________________________________");
        shops.searchWeight(needWeight);
        System.out.println("________________________________________");
        shops.searchHumanWithMaxCountOrder();

    }
}
