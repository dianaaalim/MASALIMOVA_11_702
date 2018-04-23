package ru.itis;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            File userFile = new File("C:\\Users\\pc\\Desktop\\MASALIMOVA_11_702\\CarsAndUsers\\src\\ru\\itis\\users.txt");
            File carFile = new File("C:\\Users\\pc\\Desktop\\MASALIMOVA_11_702\\CarsAndUsers\\src\\ru\\itis\\cars.txt");

            BufferedReader userReader = new BufferedReader(new FileReader(userFile));
            BufferedReader carReader = new BufferedReader(new FileReader(carFile));

            String user = userReader.readLine();
            String car = carReader.readLine();

            HashMap<Integer, Integer> ages = new HashMap<>();

            int userId = 0;
            int age = 0;

            while (user != null && car != null) {

                userId = Integer.parseInt(user.split(" ")[0]);
                int carOwnerId = Integer.parseInt(car.split(" ")[2]);

                if (userId > carOwnerId) {
                    car = carReader.readLine();
                } else if (userId < carOwnerId) {
                    user = userReader.readLine();
                } else {
                    age = Integer.parseInt(user.split(" ")[2]);
                    if (ages.containsKey(age)) {
                        ages.put(age, ages.get(age) + 1);
                    } else {
                        ages.put(age, 1);
                    }

                    car = carReader.readLine();
                }
            }

            for (Map.Entry entry : ages.entrySet()) {
                System.out.println("Возраст: " + entry.getKey() + " Кол-во машин: " + entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}