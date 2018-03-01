package ru.itis.BinarSerarch;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 6, 7, 8};
        BinarSearcing binarSearcing = new BinarSearcing();
        int a = binarSearcing.find(array, 0, array.length-1, 7);
        System.out.println(a);

        String[] lines = {"ab", "ac", "bc", "kl", "zx"};
        BinarSearchingForLines binarSearchingForLines = new BinarSearchingForLines();
        String b = binarSearchingForLines.find(lines, 0, lines.length-1, "ac");
        System.out.println(b);

        LinalSearching linalSearching = new LinalSearching();
        int c = linalSearching.find(array,0,array.length-1,3);
        System.out.println(c);

    }
}
