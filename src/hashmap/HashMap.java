package hashmap;

import list.LinkedList;

/**
 * HashMap implementation
 *
 * @param <K> key type
 * @param <V> value type
 */

public class HashMap <K, V>{

    /**
     * Method to store HashMap key-value
     *
     * @param <K> key type
     * @param <V> value type
     */

    private static class Entry<K, V>{
        K key;
        V value;
        Entry<K, V> next;

        Entry(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    private Entry<K, V>[] buckets;
    private int capacity = 100;

    /**
     * Constructor for a HashMap
     */

    public HashMap(){
        buckets = new Entry[capacity];
    }

    public void put(K key, V value){
        int index = Math.abs(key.hashCode()) % capacity;

        Entry<K, V> current = buckets[index];

        while(current != null){
            if(current.key.equals(key)){
                current.value = value;
                return;
            }
            current = current.next;
        }

        Entry<K, V> newEntry = new Entry<>(key, value);
        newEntry.next = buckets[index];
        buckets[index] = newEntry;
    }

    /**
     * Method to get a value associated with provided key
     *
     * @param key to be searched for
     * @return value associated with provided key
     */

    public V get(K key){
        int index = Math.abs(key.hashCode()) % capacity;

        Entry<K, V> current = buckets[index];

        while(current != null){
            if(current.key.equals(key)){
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public boolean containsKey(K key){
        return get(key) != null;
    }
}
