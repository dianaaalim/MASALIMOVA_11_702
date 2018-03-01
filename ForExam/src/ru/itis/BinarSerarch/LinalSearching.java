package ru.itis.BinarSerarch;

public class LinalSearching {
    public static int find(int[] array, int left, int right, int key) {
        for (int i = left; i < right; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
