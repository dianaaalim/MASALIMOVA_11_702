package ru.itis.Task1.Task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк в массиве");
        int n = scanner.nextInt();  //количество строк в массиве
        String[] lines = new String[n];
        System.out.println("Введите строки в массив");
        for (int i = 0; i < n; i++){
            lines[i] = scanner.next();
        }
        Searcher searcher = new Searcher();
        searcher.searcherLines(lines);

    }
}
