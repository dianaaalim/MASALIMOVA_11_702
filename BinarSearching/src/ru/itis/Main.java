package ru.itis;

public class Main {

    public static void main(String[] args) {

        int[] array = {2, 3, 5, 6, 7, 8};


        public int find(int array[],  int lower, int higher, int toFind) {
            int value = 0;
            int mid;
            for (int i = lower; i < higher; i++) {
                System.out.println("{");
            }
            do {
                mid = lower + (higher - lower)/2;
                if (toFind > array[mid]) {
                    if (array[mid] == array[lower]) {
                        return -1;
                    } else {
                        lower = mid;
                        find(array, lower, higher, toFind);
                    }
                } else if(toFind < array[mid]){
                    if (array[mid] == array[higher]){
                        return  -1;
                    } else {
                        higher = mid;
                        find(array, lower, higher, toFind);
                    }
                } else if ()
            }
        }


    }
}
