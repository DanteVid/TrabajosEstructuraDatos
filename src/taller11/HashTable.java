package taller11;

import java.util.ArrayList;
import java.util.List;

public class HashTable {

    private int size;
    private List<KeyValuePair>[] table;

    private static class KeyValuePair {
        String key;
        String value;

        KeyValuePair(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    // Constructor
    public HashTable(int size) {
        this.size = size;
        this.table = new ArrayList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new ArrayList<>();
        }
    }

    private int hashFunction(String key) {
        return Math.abs(key.hashCode()) % size;
    }

    public void insert(String key, String value) {
        int index = hashFunction(key);
        List<KeyValuePair> bucket = table[index];

        for (KeyValuePair pair : bucket) {
            if (pair.key.equals(key)) {
                pair.value = value;
                return;
            }
        }

        bucket.add(new KeyValuePair(key, value));
    }

    public String retrieve(String key) {
        int index = hashFunction(key);
        List<KeyValuePair> bucket = table[index];

        for (KeyValuePair pair : bucket) {
            if (pair.key.equals(key)) {
                return pair.value;
            }
        }
        return null;
    }

    public void printTable() {
        for (int i = 0; i < size; i++) {
            System.out.print("Índice " + i + ": ");
            for (KeyValuePair pair : table[i]) {
                System.out.print("[" + pair.key + ": " + pair.value + "] ");
            }
            System.out.println();
        }
    }

}
