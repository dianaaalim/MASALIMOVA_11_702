package ru.itis;

import java.util.Objects;

public class TreeBstImpl<T extends Comparable<T>> implements Tree<T> {


    private class Node {
        private T value;
        private Node left;
        private Node right;

        Node(T value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || this.getClass() != object.getClass()) {
                return false;
            }
            Node node = (Node) object;
            boolean checkValue;
            boolean checkLeft;
            boolean checkRight;
            if ((node.value != null) == true) {
                checkValue = (value != null) && value.equals(node.value);
            } else {
                checkValue = (value == null);
            }
            if ((node.left != null) == true) {
                checkLeft = (left != null) && left.equals(node.left);
            } else {
                checkLeft = (left == null);
            }
            if ((node.right != null) == true) {
                checkRight = (right != null) && right.equals(node.right);
            } else {
                checkRight = (right == null);
            }
            return checkValue && checkRight && checkLeft;
        }
    }

    private Node root;

    public TreeBstImpl() {
        this.root = null;
    }

    public void insert(T value) {
        this.root = insert(root, value);
    }

    @Override
    public boolean remove(T value) {
        return false;
    }

    @Override
    public boolean isBst() {
        return isBst(this.root);
    }

    public void print() {
        print(root);
    }

    public boolean contains(T value) {
        return contains(this.root, value);
    }


/*
TODO
@Override
public boolean equals(Object object) {
if (this == object) return true;
if (!(object instanceof TreeBstImpl)) return false;
TreeBstImpl treeBst = (TreeBstImpl) object;
return Objects.equals(root, treeBst.root);
}
*/
//Done
    private void print(Node root) {
        if (root != null) {
            print(root.left);
            System.out.print(root.value + " ");
            print(root.right);
        }
    }
//Done
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
    public boolean remove(T value, Node root) {
        return true;
    }


    //Done
    public boolean contains(Node root, T value) {
        if (root != null) {
            if (root.value.equals(value))
                return true;
            else {
                if (value.compareTo(root.value) <= 0) {
                    return contains(root.left, value);
                } else {
                    return contains(root.right, value);
                }
            }
        }
        return false;
    }

    //TODO:
    @Override
    public void printByLevels() {


    }
    public boolean isBst(Node root) {
        if (root != null) {
            if ((root.left != null && root.value.compareTo(root.left.value) < 0) || (root.right != null && root.value.compareTo(root.right.value) >= 0)) {
                return false;
            } else {
                isBst(root.left);
                isBst(root.right);
            }
        }
        return true;
    }


}
