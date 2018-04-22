package ru.itis;

class TreeBstImpl<T extends Comparable<T>> implements Tree<T> {
    class Node {
        private T value;
        private Node left;
        private Node right;
        private Node parent;

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
            root.left.parent = root;
        } else {
            root.right = insert(root.right, value);
            root.right.parent = root;
        }
        return root;
    }

    //TODO:
    public boolean remove(T value) {
//        Node node = find(value);
//        Node parent = node.parent;                          // предок удаляемого элемента
//        if (node.left == null & node.right == null) {       // первый случай: удаляемый элемент - лист
//            if (parent.left == node)
//                parent.left = null;
//            if (parent.right == node)
//                parent.right = null;
//            return true;
//        } else if (node.left == null | node.right == null)   // второй случай: удаляемый элемент имеет одного потомка
//            if (node.left == null) {
//                if (parent.left == node)
//                    parent.left = node.right;
//                else
//                    parent.right = node.right;
//                node.right.parent = parent;
//            } else {
//                if (parent.left == node)
//                    parent.left = node.left;
//                else
//                    parent.right = node.left;
//                node.left.parent = parent;
//                return true;
//            }
//        else {                                               // третий случай: удаляемый элемент имеет двух потомков
//            Node successor = next(node);
//            node.value = successor.value;
//            if (successor.parent.left == successor) {
//                successor.parent.left = successor.right;
//                if (successor.right != null)
//                    successor.right.parent = successor.parent;
//            } else {
//                successor.parent.right = successor.right;
//                if (successor.right != null)
//                    successor.right.parent = successor.parent;
//            }
//            return true;
//        }
        return false;
    }

    //TODO:
    public boolean contains(T value) {
        Node node = root;
        if (node == null)
            return false;

        while (node != null) {
            if (node.value.compareTo(value) == 0)
                return true;
            else if (node.value.compareTo(value) > 0)
                node = node.left;
            else
                node = node.right;
        }
        return false;
    }

    //TODO:
    @Override
    public void printByLevels() {
//        printByLevels(root);
    }

    //TODO
    @Override
    public boolean isBst() {
        return isBst(root);
    }

    private boolean isBst(Node node) {
        if (node != null) {
            if ((node.left != null && node.value.compareTo(node.left.value) < 0) || (node.right != null && node.value.compareTo(node.right.value) >= 0)) {
                return false;
            } else {
                isBst(node.left);
                isBst(node.right);
            }
        }
        return true;
    }
//    public boolean equals(TreeBstImpl tree) {
//        Node node = tree.root;
//        Node newNode = root;
//        return equals(node, newNode);
//    }
//
//    private boolean equals(Node node, Node newNode) {
//        try {
//            if (node == null & newNode == null)
//                return true;
//            else if (node.value.compareTo(newNode.value) == 0)
//                return equals(node.left, newNode.left) && equals(node.right, newNode.right);
//            return false;
//        } catch (NullPointerException e) {
//            return false;
//        }
//    }

//    private Node find(T value) {
//        Node node = root;
//        while (node != null) {
//            if (node.value.compareTo(value) == 0)
//                return node;
//            if (node.value.compareTo(value) > 0)
//                node = node.left;
//            else node = node.right;
//        }
//        return null;
//    }

//    private Node next(Node node) {
//        if (node.right != null)
//            return minimum(node.right);
//        Node y = node.parent;
//        while (y != null & node == y.right) {
//            node = y;
//            y = y.parent;
//        }
//        return y;
//    }
//
//    private Node minimum(Node node) {
//        if (node.left == null)
//            return node;
//        return minimum(node.left);
//    }
}