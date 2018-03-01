package ru.itis;

public class Main {

    public static void main(String[] args) {
        IntegerList integerList = new IntegerList();
        integerList.add(11);
        integerList.add(22);
        integerList.add(33);
        integerList.add(44);
        integerList.add(55);
        IntegerList sumList = integerList.map(number -> {
                    int sum = 0;
                    while (number > 0) {
                        sum += number % 10;
                        number /= 10;
                    }
                    return sum;
                }
        );

        sumList.printNums();

        IntegerList sortedList = integerList.filter(number -> {
            if (number % 2 == 0) {
                return false;
            } else return true;
        });
        System.out.println("**********************");

        sortedList.printNums();
    }
}
