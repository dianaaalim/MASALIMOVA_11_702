package ru.itis;

public class Main {

    public static void main(String[] args) throws Exception {
        MyScanner scannerInt = new MyScanner("C:/Users/pc/Desktop/MASALIMOVA_11_702/MyScanner/src/ru/itis/inputInt.txt");
        int number = scannerInt.nextInt();
        System.out.println(number);
        MyScanner scannerStr = new MyScanner("C:/Users/pc/Desktop/MASALIMOVA_11_702/MyScanner/src/ru/itis/inputString.txt");
        String line = scannerStr.nextLine();
        System.out.println(line);
    }
}
