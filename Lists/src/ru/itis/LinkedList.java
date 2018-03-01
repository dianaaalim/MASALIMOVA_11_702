package ru.itis;

import java.util.Iterator;

public class LinkedList<T> implements List<T> {


    private class Node {
        T value;
        Node next;

        Node(T value) {
            this.value = value;
        }
    }

    // ссылка на первый элемент списка
    private Node head;
    // ссылка на последний элемент списка
    private Node tail;
    // размер списка(количество элементов)
    private int count;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    @Override
    public T get(int index) {
        Node element = this.head;
        if (index >= 0 && index < count) {
            for (int i = 0; i < index; i++) {
                element = element.next;
            }
        } else {
            throw new IllegalArgumentException();
        }
        return element.value;
    }

    @Override
    public void addToBegin(T object) {
        Node newNode = new Node(object);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        this.count++;
    }

    @Override
    public void add(T element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        this.count++;
    }

    @Override
    public void remove(T element) {

        if (!contains(element)) {
            throw new IllegalArgumentException();
        }
        Node previous = null;
        Node current = this.head;

        while (current != null) {
            if (current.value.equals(element)) {
                if (previous != null) {
                    previous.next = current.next;
                    if (current.next == null) {
                        this.tail = previous;
                    }

                } else {
                    this.head = this.head.next;
                    if (this.head == null) {
                        this.tail = null;
                    }
                }
                count--;
            }
            previous = current;
            current = current.next;

        }
    }

    @Override
    public boolean contains(T element) {
        Node node = this.head;
        while (node != null) {
            if (node.value.equals(element)) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public LinkedList reverse() {
        Node node = this.head;
        LinkedList newList = new LinkedList();

        while (node != null) {
            newList.addToBegin(node.value);
            node = node.next;
        }
        return newList;
    }

//вставка со сдвигом
    public void set(int index, T element) {
        if (index > count) throw new IllegalArgumentException();
        Node current = this.head;
        Node newNode = new Node(element);

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;

    }


    public int size() {
        return count;
    }

    public void print() {
        Node node = this.head;
        while (node != this.tail) {
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println(node.value);

    }

    //Надо сделать сортировку
    public static <E extends Comparable<E>> LinkedList<E> merge(LinkedList<E> aList, LinkedList<E> bList) {
        LinkedList<E> result = new LinkedList<>();
        Iterator<E> aIterator = aList.iterator();
        Iterator<E> bIterator = bList.iterator();
        E mergeA = aIterator.next();
        E mergeB = bIterator.next();

        if (aIterator.hasNext()) {
            result.add(mergeA);
            while (aIterator.hasNext()) {
                result.add(aIterator.next());
            }
        }
        if (bIterator.hasNext()) {
            result.add(mergeB);
            while (bIterator.hasNext()) {
                result.add(bIterator.next());
            }
        }

        return result;
    }


    private class LinkedListIterator implements Iterator<T> {
        private int currentIndex;
        Node current = head;

        LinkedListIterator() {
            this.currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public T next() {
            T result = current.value;
            current = current.next;
            currentIndex++;
            return result;
        }

    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }


}

