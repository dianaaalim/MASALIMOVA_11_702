package ru.itis.AscendingStrings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] lines = new String[n];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = scanner.next();
        }

        HaveAscendingString haveAscendingString = new HaveAscendingString();
        System.out.println(haveAscendingString.haveStr(lines));
    }
}
