package ru.itis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File matrixtable = new File("C:\\Users\\pc\\Desktop\\MASALIMOVA_11_702\\LittleMatrix\\src\\ru\\itis\\matrixtable.txt");
        Scanner scannerMatrix = new Scanner(matrixtable);
        MatrixImpl matrix = new MatrixImpl();
        while(scannerMatrix.hasNext()){
            matrix.line.add(scannerMatrix.nextInt());
            matrix.column.add(scannerMatrix.nextInt());
            matrix.setValue();
        }
    }
}
