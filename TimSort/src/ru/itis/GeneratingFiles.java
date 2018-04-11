package ru.itis;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

import static ru.itis.Main.ARRAY_SIZE;

public class GeneratingFiles {

    public static void intoFile() {
        final Random random = new Random();
        try (final FileWriter writer = new FileWriter("C:\\Users\\pc\\Desktop\\MASALIMOVA_11_702\\TimSort\\src\\ru\\itis\\fileInput.txt", false)) {
            for (int i = 0; i < ARRAY_SIZE; i++) {
                int n = random.nextInt(10000);
                final String s = Integer.toString(n);
                writer.write(s);
                writer.write(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void outToFile(int[] array) {
        try (final FileWriter writer = new FileWriter("C:\\Users\\pc\\Desktop\\MASALIMOVA_11_702\\TimSort\\src\\ru\\itis\\fileOutput.txt", false)) {
            for (int i = 0; i < array.length; i++) {
                final String s = Integer.toString(array[i]);
                writer.write(s);
                writer.write(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void readerFromFile(int[] array) {
        try{
            Scanner scanner = new Scanner(new File("C:\\Users\\pc\\Desktop\\MASALIMOVA_11_702\\TimSort\\src\\ru\\itis\\fileInput.txt"));
            for (int i = 0; i < ARRAY_SIZE; i++) {
                array[i] = scanner.nextInt();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
