package ru.itis;

public class Array {

        public static int[] shiftLeft(int[] a, int shift) {
            if (a != null) {
                int length = a.length;
                int[] b = new int[length];
                // шаг 1
                System.arraycopy(a, shift, b, 0, length - shift);
                // шаг 2
                System.arraycopy(a, 0, b, length - shift, shift);
                return b;
            } else {
                return null;
            }
        }

}
