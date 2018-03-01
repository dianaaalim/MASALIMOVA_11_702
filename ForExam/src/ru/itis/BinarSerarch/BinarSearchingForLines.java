package ru.itis.BinarSerarch;

public class BinarSearchingForLines {
    public String find(String[] lines, int lower, int higher, String toFind){
        int value = 0;
        int mid;
        do {
            mid = lower + (higher - lower) / 2;
            if (toFind.compareTo(lines[mid]) > 0) {
                if (lines[mid].equals(lines[lower])) {
                    return "Мы не нашли строку в массиве";
                } else {
                    lower = mid;
                    find(lines, lower, higher, toFind);
                }
            } else if (toFind.compareTo(lines[mid]) < 0) {
                if (lines[mid].equals(lines[higher])) {
                    return "Мы не нашли строку в массиве";
                } else {
                    higher = mid;
                    find(lines, lower, higher, toFind);
                }
            } else if(toFind.equals(lines[mid])) {
                value = mid;
            }
        }while (!lines[mid].equals(toFind));
        return "Мы нашли строку в массиве";
    }
}
