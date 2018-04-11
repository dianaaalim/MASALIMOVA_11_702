package ru.itis;

public class TreeBstImpl<T extends Comparable<T>> implements Tree<T> {

    class Node {
        private T value;
        private Node left;
        private Node right;

        Node(T value) {
            this.value = value;
        }
    }

    private Node root;

    public TreeBstImpl() {
        this.root = null;
    }

    public void insert(T value) {
        this.root = insert(root, value);
    }

    public void print() {
        print(root);
    }

    private void print(Node root) {
        if (root != null) {
            print(root.left);
            System.out.print(root.value + " ");
            print(root.right);
        }
    }

    private Node insert(Node root, T value) {
        if (root == null) {
            root = new Node(value);
        } else if (value.compareTo(root.value) <= 0) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    //TODO:
    public boolean remove(T value) {
        if (root == null) {
            return false;
        }
//        if (value.compareTo(root.value) == 0) {
//            if (root.left == null) {
//                root = root.right;
//            } else if(root.right == null){
//                root = root.left;
//            }
//        } else
        if (value.compareTo(root.value) <= 0) {
            root = root.left;
            remove(value);
        } else {
            root = root.right;
            remove(value);
        }

        return false;
    }

    //TODO:
    public boolean contains(T value) {
        return false;
    }

    //TODO:
    @Override
    public void printByLevels() {

    }

    //TODO
    @Override
    public boolean isBst() {
        if (root == null) {
            return false;
        }
        while (root.right != null) {
            if (root.value.compareTo(root.left.value) <= 0 &&
                    root.value.compareTo(root.right.value) > 0) {
                if (root.left != null) {
                    root = root.left;
                } else {
                    root = root.right;
                }
            }
        }
        return true;
    }

    //TODO:
    public boolean equals(Object object) {
        return false;
    }
}
