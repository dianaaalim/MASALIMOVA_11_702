package ru.itis;


public class Main {

    public static void main(String[] args) {
        int array[] = {5, 4, 8, 2, 5, 6, 10, 1, 3, 6, 7, 4};

        TreeBstImpl<Integer> tree = new TreeBstImpl<>();

        for (int i = 0; i < array.length; i++) {
            tree.insert(array[i]);
        }

        int array1[] = {5, 4, 8, 2, 5, 6, 10, 1, 3, 6, 7, 4};

        TreeBstImpl<Integer> tree1 = new TreeBstImpl<>();

        for (int i = 0; i < array.length; i++) {
            tree1.insert(array1[i]);
        }
        tree.print();
        System.out.println();
        System.out.println(tree.equals(tree1));
    }
}
