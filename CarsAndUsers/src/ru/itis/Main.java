package ru.itis;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Car> cars = new ArrayList<>();




        try {
            File inputUsers = new File("C:\\Users\\pc\\Desktop\\CarsAndUsers\\src\\ru\\itis\\users.txt");
            Scanner scanner = new Scanner(inputUsers);
            while (scanner.hasNext()) {
                int id = scanner.nextInt();
                String name = scanner.next();
                int age = scanner.nextInt();
                User user = new User(id, name, age);
                users.add(user);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        try {
            File inputUsers = new File("C:\\Users\\pc\\Desktop\\CarsAndUsers\\src\\ru\\itis\\cars.txt");
            Scanner scanner = new Scanner(inputUsers);
            while (scanner.hasNext()) {
                int carID = scanner.nextInt();
                String model = scanner.next();
                int id = scanner.nextInt();
                Car car = new Car(carID, model, id);
                cars.add(car);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < users.size(); i++){
            users.get(i).addCar(cars);
        }




    }
}
