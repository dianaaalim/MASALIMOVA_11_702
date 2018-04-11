package ru.itis;

public class Main {

    public static final int ARRAY_SIZE = 8192;

    public static void main(String[] args) {


        int[] array = new int[ARRAY_SIZE];
        GeneratingFiles.intoFile();
        GeneratingFiles.readerFromFile(array);
//        TimSort timSort = new TimSort();
        AnotherTimSort anotherTimSort = new AnotherTimSort();
        long startTime = System.currentTimeMillis();
        System.out.println("Начальное время в миллисекундах : " + startTime);
        long startTime1 = System.nanoTime();
        System.out.println("Начальное время в nano : " + startTime1);
//        timSort.timSorting(array);
        anotherTimSort.timSort(array, ARRAY_SIZE);
        long finishTime = System.currentTimeMillis();
        System.out.println("Конечное время в миллисекундах : " + finishTime);
        long finishTime1 = System.nanoTime();
        System.out.println("Конечное время в nano : " + finishTime1);
        GeneratingFiles.outToFile(array);

        System.out.println("Время сортировки через миллисекунды:" + (finishTime-startTime));
        System.out.println("Время сортировки через наносекунды:" + (finishTime1-startTime1)/1000000);

    }
}
