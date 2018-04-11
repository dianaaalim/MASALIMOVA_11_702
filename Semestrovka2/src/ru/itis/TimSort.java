package ru.itis;

public class TimSort {
    public static final int RUN = 32;

    public static void insertionSort(int arr[], int left, int right) {
        int iter = 0;
        for (int i = left + 1; i <= right; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= left && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
            iter++;
        }
        System.out.println("Iter = " + iter);
    }
    // функция слияния объединяет отсортированный run
    public static void merge(int arr[], int l, int m, int r) {
// исходный массив разбивается на две части
// левый и правый массивы
        int lenght1 = m - l + 1;
        int lenght2 = r - m;
        if (lenght2 < 0) lenght2 += RUN;
        int[] left = new int[lenght1];
        int[] right = new int[lenght2];
        for (int i = 0; i < lenght1; i++) {
            left[i] = arr[l + i];
        }
        for (int i = 0; i < lenght2; i++) {
            right[i] = arr[m + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = l;

// после сравнения мы объединяем эти два массива
// в большем массиве sub
        while (i < lenght1 && j < lenght2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

// копировать оставшиеся элементы слева, если таковые имеются
        while (i < lenght1) {
            arr[k] = left[i];
            k++;
            i++;
        }

// copy remaining element of right, if any
        while (j < lenght2) {
            arr[k] = right[j];
            k++;
            j++;
        }
    }

    // итеративная функция Timsort для сортировки
// array[0...n-1] (аналогично сортировке слиянием)
    public static void timSort(int arr[], int n) {
        int iter = 0;
        long timeBefore = System.currentTimeMillis();
        for (int i = 0; i < n; i += RUN) {
            insertionSort(arr, i, Math.min((i + 31), (n - 1)));
        }
        for (int size = RUN; size < n; size = 2 * size) {
            for (int left = 0; left < n; left += 2 * size) {
                int mid = left + size - 1;
                int right = Math.min((left + 2 * size - 1), (n - 1));

                if (mid > n) break;
                merge(arr, left, mid, right);
            }
            iter ++;
        }
        long timeAfter = System.currentTimeMillis();
        System.out.println("Размер "+ arr.length);
        System.out.println("Количество итераций  " + iter);
        System.out.println("Время работы сортировки в милисекндах: " + (timeAfter - timeBefore));

    }


}
