package MyHashMap;

import java.util.Arrays;

public class MyHashMap<E, V> {
    private int size;
    private final int DEFAULT_CAPACITY = 16;
    @SuppressWarnings("unchecked")
    private Node<E, V>[] values = new Node[DEFAULT_CAPACITY];

    public static class Node<K, V> {
        private final K key;
        private V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    public void put(E key, V value) {
        boolean insert = true;
        for (int i = 0; i < size; i++) {
            if (values[i].getKey().equals(key)) {
                values[i].setValue(value);
                insert = false;
            }
        }
        if (insert) {
            ensure();
            values[size++] = new Node<>(key, value);
        }
    }
    private void ensure() {
        if (size == values.length) {
            int newSize = values.length * 2;
            values = Arrays.copyOf(values, newSize);
        }
    }

    public void remove(E key) {
        for (int i = 0; i < size; i++) {
            if (values[i].getKey().equals(key)) {
                values[i] = null;
                size--;
                condense(i);
            }
        }
    }

    private void condense(int start) {
        for (int i = start; i < size; i++) {
            values[i] = values[i + 1];
        }
    }

    public void clear() {
        values = null;
    }

    public int size() {
        return size;
    }

    public V get(E key) {
        for (int i = 0; i < size; i++) {
            if (values[i] != null) {
                if (values[i].getKey().equals(key)) {
                    return values[i].getValue();
                }
            }
        }
        return null;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(values[i].getKey()).append("=").append(values[i].getValue()).append(" ");
        }
        return stringBuilder.toString();
    }

}

