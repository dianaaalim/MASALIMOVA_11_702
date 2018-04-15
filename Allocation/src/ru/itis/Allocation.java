package ru.itis;

import java.util.ArrayList;

public class Allocation {
    public int allocationTree(int N, int K, int[] array) throws IllegalArgumentException {
        if (N > 0 && K > 0 && array.length > 0) {
            ArrayList<Integer> list = new ArrayList<>();
            int added = 0;
            for (int i = 0; i < N - 1; i++) {
                list.add(array[i]);
            }
            int size = list.size();
            int[] repeatedArr = new int[size];
            for (int i = 0; i < N - 1; i++) {
                repeatedArr[array[i]]++;
            }
            for (int i = 0; i < size; i++) {
                while (repeatedArr[i] > K) {
                    if (K * K > repeatedArr[i]) {
                        if ((double) (repeatedArr[i] % K) > 0) {
                            added += (repeatedArr[i] / K) + 1;
                            repeatedArr[i] = repeatedArr[i] - K * ((repeatedArr[i] / K) + 1);
                        } else {
                            added += repeatedArr[i] / K;
                            repeatedArr[i] = repeatedArr[i] - K * (repeatedArr[i] / K);
                        }
                    } else {
                        added += K;
                        repeatedArr[i] = repeatedArr[i] - K * (repeatedArr[i] / K);
                    }
                }

            }
            return added;
        } else {
            throw new IllegalArgumentException();
        }

    }

}
