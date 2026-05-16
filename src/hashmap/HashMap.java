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

    public HashMap(){
        buckets = new Entry[capacity];
    }
}
