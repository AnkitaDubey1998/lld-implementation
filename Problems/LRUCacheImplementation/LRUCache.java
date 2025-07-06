package Problems.LRUCacheImplementation;

import java.util.HashMap;

public class LRUCache<K, V> {
    private final int capacity;
    private final HashMap<K, Node<K, V>> map;
    private final DoubleLinkedList<K, V> dll;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.dll = new DoubleLinkedList<>();
    }

    public synchronized V get(K key) {
        if(!map.containsKey(key)) return null;
        Node<K, V> node = map.get(key);
        dll.remove(node);
        dll.addAtFirst(node);
        return node.value;
    }

    public synchronized void put(K key, V value) {
        Node<K, V> node;
        if(map.containsKey(key)) {
            node = map.get(key);
            dll.remove(node);
        } else {
            node = new Node<>(key, value);
            map.put(key, node);
        }
        dll.addAtFirst(node);
        if(map.size() > capacity) {
            Node<K, V> nodeToDelete = dll.removeLast();
            if(nodeToDelete != null) {
                map.remove(nodeToDelete.key);
            }
        }
    }

    public void displayCacheElements() {
        System.out.println("\nCache elements :");
        dll.displayElements();
    }
}
