package ru.itis.TwoSameNum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во элементов в массиве");
        int count = sc.nextInt();

        int array[] = new int[count];

        System.out.println("Введите элементы");
        for(int i = 0; i < count; i++){
            array[i] = sc.nextInt();
        }

//        FinderTwoSame finderTwoSame = new FinderTwoSame();
//        System.out.println(finderTwoSame.checker(array));

        FinderOfNita finderOfNita = new FinderOfNita();
        System.out.println(finderOfNita.founder(array));
    }
}
