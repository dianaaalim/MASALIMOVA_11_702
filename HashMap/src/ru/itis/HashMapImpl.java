package ru.itis;

public class HashMapImpl<K, V> implements Map<K, V> {

    private KeyValue[] map;

    private static class KeyValue<K, V> {
        private Node node;

        private void add(K key, V value) {
            Node<K, V> newNode = new Node<>(key, value);
            if (node == null) {
                node = newNode;
            } else {
                node.next = newNode;
            }
        }

        private int contains(K key) {
            Node<K, V> current = node;
            int count = 0;
            while (current != null) {
                if (current.key.equals(key)) {
                    return count;
                }
                current = current.next;
            }
            return -1;
        }

        private void set(int count, V value) {
            Node current = node;
            for (int i = 0; i < count; i++) {
                current = current.next;
            }
            current.value = value;
        }
    }

    HashMapImpl() {
        map = new KeyValue[15];
    }

    private static class Node<K, V> {
        private K key;
        private V value;
        private Node next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }


    @Override
    public void put(K key, V value) {
        int position = Math.abs(key.hashCode() % 15);
        if (map[position] == null) {
            map[position] = new KeyValue();
            map[position].add(key, value);
            return;
        }
        int count = map[position].contains(key);
        if (count >= 0) {
            map[position].set(count, value);
        } else {
            map[position].add(key, value);
        }
    }


    @Override
    public V get(K key) {
        int position = Math.abs(key.hashCode() % 15);
        boolean unFounded = true;
        if (map[position] == null) return null;
        Node current = map[position].node;
        while (unFounded && current != null) {
            if (current.key.equals(key)) {
                return (V) current.value;
            }
            current = current.next;
        }
        return null;
    }
}