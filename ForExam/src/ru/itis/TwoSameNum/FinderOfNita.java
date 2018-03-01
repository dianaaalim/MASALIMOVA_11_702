package ru.itis.TwoSameNum;

public class FinderOfNita {
    public  boolean founder(int[] nums) {
        boolean sute = true;
        int h0 = 0;
        int h1 = 0;
        for (int n : nums) {
            if (h0 <= 2 || h1 <= 2) {
                if (n % 10 % 2 == 0){
                    while (n > 0 && sute){
                        if (n % 10 % 2 == 0) n /= 10;
                        else sute = false;
                    }
                    if (sute) h0++;
                }
                if (n % 10 % 2 == 1){
                    while (n > 0 && sute){
                        if (n % 10 % 2 == 1) n /= 10;
                        else sute = false;
                    }
                    if (sute) h1++;
                }

                sute = true;
            }
        }
        if (h0 == 2 || h1 == 2) return true;
        else return false;
    }
}
