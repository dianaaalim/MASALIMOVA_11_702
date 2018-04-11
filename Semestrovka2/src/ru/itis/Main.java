package ru.itis;



public class Main {
    public static final int AMOUNT = 2000;

    public static void main(String[] args) {

        ReaderAndWriter.writer();
        TimSort timSort = new TimSort();
        int[] arr = ReaderAndWriter.reader();
        timSort.timSort(arr, AMOUNT);
        ReaderAndWriter.writerAnswer(arr);
    }
}
