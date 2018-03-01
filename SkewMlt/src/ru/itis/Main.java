package ru.itis;

public class Main {

    public static void main(String[] args) {
        // Координаты начала
        int x1 = 3;
        int y1 = 3;
        // Координаты конца
        int x2 = 1;
        int y2 = 1;
        // Координаты искомой точки
        int x = 3;
        int y = 2;
        System.out.println(skewMultply(x1, y1, x2, y2, x, y));
    }

    public static String skewMultply(int x1, int y1, int x2, int y2, int x, int y) {
        int multiply;
        multiply = (x2 - x1) * (y1 - y) - (y2 - y1) * (x1 - x);
        if (multiply > 0) {
            return "Ниже прямой";
        } else {
            return "Выше прямой";
        }
    }
}
