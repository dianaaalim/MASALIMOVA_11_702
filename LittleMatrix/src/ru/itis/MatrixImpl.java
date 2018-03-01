package ru.itis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MatrixImpl implements Matrix{
    static int value;
    static ArrayList<Integer> line = new ArrayList<>();
    static ArrayList<Integer> column = new ArrayList<>();
    Scanner scannerValue = new Scanner(System.in);

    static int[][] values = new int[line.size()][column.size()];

    @Override
    public void setValue(int i, int j, int value) {
        for (int l = 0; l < line.size(); l++){
            for (int k = 0; k < column.size(); k++){
                value = scannerValue.nextInt();
                values[line.get(l)][column.get(k)] = value;
            }
        }
        System.out.println(Arrays.toString(values));
    }
    @Override
    public int getValue(int i, int j) {
        return value;
    }

}
