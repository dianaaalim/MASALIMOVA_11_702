package ru.itis;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        File input = new File("C:\\Users\\pc\\Desktop\\MASALIMOVA_11_702\\Temperature\\src\\ru\\itis\\input.txt");
        Scanner scanner = new Scanner(input);
        double yearTemp = 0;
        double[] monthTemp = new double[12];
        int[] days = new int[12];
        while(scanner.hasNext()){
            String date = scanner.next();
            String temp = scanner.next();
            int month = ((int) date.charAt(3) - '0') * 10 + ((int) date.charAt(4) - '0');
            monthTemp[month - 1] += Double.parseDouble(temp);
            days[month - 1]++;

        }
        for (int i = 0; i < 12; i++){
            yearTemp += monthTemp[i];
            monthTemp[i] /= days[i];
        }
        yearTemp /= 366;
        double minDif = Math.abs(monthTemp[0] - yearTemp);
        for (int i = 1; i < 12; i++){
            if (Math.abs(monthTemp[i] - yearTemp) < minDif){
                minDif = Math.abs(monthTemp[i] - yearTemp);
            }
        }
        for (int i = 0; i < 12; i++){
            if (Math.abs(monthTemp[i] - yearTemp) == minDif){
                System.out.println(i + 1);
            }
        }
    }
}