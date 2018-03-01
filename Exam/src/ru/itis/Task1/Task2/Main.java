package ru.itis.Task1.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 3; //размерность матрицы
        double[][] matrix = new double[n][n];
        System.out.print("Введите коэффиценты a1...a9");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        double[] freeCof = new double[n];
        System.out.println("Введите свободние члены выражения b1...b3");
        for (int i = 0; i < n; i++){
            freeCof[i] = scanner.nextDouble();
        }
        SystemLinFromThree systemLinFromThree = new SystemLinFromThree(matrix[0][0], matrix[0][1], matrix[0][2], matrix[1][0], matrix[1][1], matrix[1][2], matrix[2][0], matrix[2][1], matrix[2][2], freeCof[0], freeCof[1], freeCof[2]);
        System.out.println(systemLinFromThree.kramer());
        systemLinFromThree.sistema();
    }
}
