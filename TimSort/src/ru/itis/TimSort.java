package ru.itis;


public class TimSort {
    public final int MINRUN = 32;

    public void insertionSort(int[] arr) {
        int temp, j;
        for(int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;
                while (j > 0 && temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
        }
    }

    // merge function merges the sorted runs
    public void merge(int arr[], int l, int m, int r) {
        // original array is broken in two parts
        // left and right array
        int len1 = r / 2;
        int len2 = r - len1;
        int[] left = new int[len1];
        int[] right = new int[len2];
        for (int i = 0; i < len1; i++)
            left[i] = arr[i];
        for (int i = len1; i < len2; i++)
            right[i] = arr[i];

        int i = 0;
        int j = 0;
        int k = 0;

        // after comparing, we merge those two array
        // in larger sub array
        while (i < len1 && j < len2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // copy remaining elements of left, if any
        while (i < len1) {
            arr[k] = left[i];
            k++;
            i++;
        }

        // copy remaining element of right, if any
        while (j < len2) {
            arr[k] = right[j];
            k++;
            j++;
        }
    }

    // iterative Timsort function to sort the
    // array[0...n-1] (similar to merge sort)
    public void timSorting(int arr[]) {
        // Sort individual subarrays of size MINRUN
        for (int i = 0; i < arr.length; i += MINRUN) {
            insertionSort(arr);
        }

        // start merging from size MINRUN (or 32). It will merge
        // to form size 64, then 128, 256 and so on ....
        for (int size = MINRUN; size < arr.length; size = 2 * size) {
            // pick starting point of left sub array. We
            // are going to merge arr[left..left+size-1]
            // and arr[left+size, left+2*size-1]
            // After every merge, we increase left by 2*size
            for (int left = 0; left < arr.length; left += 2 * size) {
                // find ending point of left sub array
                // mid+1 is starting point of right sub array
                int mid = arr.length / 2;
                int right = arr.length - mid;


                // merge sub array arr[left.....mid] &
                // arr[mid+1....right]
                merge(arr, left, mid, right);
            }
        }
    }

}
