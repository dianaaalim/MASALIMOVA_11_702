package ru.itis;

import java.util.ArrayList;

public class User {
    int id;
    String name;
    int age;
    int[] carsOfOwner;


    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public void addCar(ArrayList<Car> cars) {
        ArrayList carsOfUser = new ArrayList();
        for (int i = 0; i < cars.size(); i++) {
            if ()
        }


        for (int i = 0; i < cars.size(); i++) {
            carsOfUser.add(users.get(cars.get(i).id).age, cars.get(i).carID);
        }




    }

    public void countOfCars(ArrayList carsOfUsers) {
//        for (int i = 0; i < carsOfUsers.size(); i++) {
//            if (carsOfUsers.get(i) != null) {
//                System.out.println(i + carsOfUsers.get(i));
//            }
//        }


    }


}
