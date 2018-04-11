package ru.itis;

public class Allocation {
    public int allocationTree(int N, int K, int[] array) {
        int[] repeatedArr = new int[10];
        int added = 0;
        for (int i = 0; i < N - 1; i++) {
            repeatedArr[array[i]]++;
        }
        for (int i = 0; i < 10; i++) {
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
    }

}
