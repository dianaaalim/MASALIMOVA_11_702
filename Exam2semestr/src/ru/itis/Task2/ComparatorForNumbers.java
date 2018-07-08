package ru.itis.Task2;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorForNumbers implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
        char[] a = o1.toCharArray();
        char[] b = o2.toCharArray();
        int n1 = returnMax(a);
        int n2 = returnMax(b);
        return n1- n2;
    }

    public int returnMax(char[] a) {
        int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int number = 0;
        for (int i = 0; i < a.length; i++) {
            if (array[a[i]  - '0'] == 0) {
                array[a[i] - '0'] = 1;
                number++;
            }
        }
        return number;
    }


}


