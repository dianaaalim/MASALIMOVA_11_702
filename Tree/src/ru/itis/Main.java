package ru.itis;


public class Main {

    public static void main(String[] args) {
        int array[] = {5, 4, 8, 2, 5, 6, 10, 1, 3, 6, 7, 4};

        TreeBstImpl tree2 = new TreeBstImpl();
        for (int i = 0; i < array.length; i++) {
            tree2.insert(array[i]);
        }
        tree2.print();
        System.out.println();
        tree2.remove(1);
        tree2.print();
        System.out.println();
        System.out.println(tree2.isBst());
        tree2.insert(5);
        tree2.print();

    }
}
