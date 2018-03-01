package ru.itis.CiklSdvig;

public class ArrayToRightLeft {
    public static int[] shiftLeft(int[] a, int shift) {
        if (a != null) {
            int length = a.length;
            int[] b = new int[length];
            System.arraycopy(a, shift, b, 0, length - shift);
            System.arraycopy(a, 0, b, length - shift, shift);
            return b;
        } else {
            return null;
        }
    }
}
