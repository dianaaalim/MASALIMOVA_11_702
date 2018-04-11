package ru.itis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите максимальное число детей одного узла");
        int K = sc.nextInt();
        int N = 0;
        int[] array = null;
        File file = new File("C:\\Users\\pc\\Desktop\\MASALIMOVA_11_702\\Allocation\\src\\ru\\itis\\file.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                scanner.nextInt();
                N++;
            }

            array = new int[N - 1];
            int i = 0;
            while (scanner.hasNextLine()) {
                array[i] = scanner.nextInt();
                System.out.println(array[i]);
                i++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Allocation allocation = new Allocation();
        System.out.println("Нужно добавить узлов: " + allocation.allocationTree(N, K, array));


    }
}
