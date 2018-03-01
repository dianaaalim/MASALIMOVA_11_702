package ru.itis;

import java.io.FileInputStream;

public class MyScanner {
    private FileInputStream input;

    public MyScanner(String name) {
        try {
            input = new FileInputStream(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String nextLine() throws Exception {
        byte bytes[] = new byte[100];
        int length = input.read(bytes);
        String line = "";
        for (int i = 0; i < length; i++) {
            line += (char) bytes[i];
        }
        return line;
    }

    public int nextInt() throws Exception {
        byte bytes[] = new byte[100];
        int length = input.read(bytes);
        int number = 0;
        int pow = 1;
        for (int i = length - 1; i >= 0; i--) {
            if ((char) bytes[i] - '0' >= 0 && (char) bytes[i] - '0' <= 9) {
                number += ((char) bytes[i] - '0') * pow;
                pow *= 10;
            }
        }
        return number;
    }

}
