package ru.itis.BinarSerarch;

public class BinarSearcing {
    public int find(int array[], int lower, int higher, int toFind) {
        int value = 0;
        int mid;
        do {
            mid = lower + (higher - lower) / 2;
            if (toFind > array[mid]) {
                if (array[mid] == array[lower]) {
                    return -1;
                } else {
                    lower = mid;
                    find(array, lower, higher, toFind);
                }
            } else if (toFind < array[mid]) {
                if (array[mid] == array[higher]) {
                    return -1;
                } else {
                    higher = mid;
                    find(array, lower, higher, toFind);
                }
            } else if(toFind == array[mid]) {
                value = mid;
            }
        } while (array[mid] != toFind);
        return value;
    }
}
