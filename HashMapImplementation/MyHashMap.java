package HashMapImplementation;

public class MyHashMap<K, V> {

    private static final int INITIAL_SIZE = 1 << 4;         // bitwise left shift of 1, which results in value of 2^4 = 16
    private static final int MAXIMUM_CAPACITY = 1 << 30;    // since size of hashmap will in powers of 2 i.e. indexing will be int. int range in Java is from 2^-31 to 2^31 - 1. Hence, we take maximum power of 2 which is less than 2^31 i.e. 2^30

    public Entry[] hashTable;

    public MyHashMap() {
        hashTable = new Entry[INITIAL_SIZE];
    }

    public MyHashMap(int capacity) {
        int tableSize = getTableSizeFor(capacity);
        hashTable = new Entry[tableSize];
    }

    final int getTableSizeFor(int capacity) {
        int n = capacity - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY)? MAXIMUM_CAPACITY : n + 1;
    }

    class Entry<K, V> {
        public K key;
        public V value;
        public Entry next;

        Entry(K k, V v) {
            key = k;
            value = v;
        }
    }

    public void put(K key, V value) {
        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];
        if(node == null) {
            Entry newNode = new Entry(key, value);
            hashTable[hashCode] = newNode;
        } else {
            Entry previousNode = node;
            while(node != null) {
                if(node.key == key) {
                    node.value = value;
                    return;
                }
                previousNode = node;
                node = node.next;
            }
            Entry newNode = new Entry(key, value);
            previousNode.next = newNode;
        }
    }

    public V get(K key) {
        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];
        while(node != null) {
            if(node.key.equals(key)) {
                return (V) node.value;
            }
        }
        return null;
    }

    public static void main(String args[]) {
        MyHashMap<Integer, String> map = new MyHashMap<>(7);  // hashmap will be of size 8, since next power of 2 after 7 is 2^3 = 8
        map.put(1, "Hi");
        map.put(2, "my");
        map.put(3, "name");
        map.put(4, "is");
        map.put(5, "Ankita");
        map.put(6, "how");
        map.put(7, "are");
        map.put(8, "you");
        map.put(9, "friends");
        map.put(10, "?");

        String value = map.get(5);
        System.out.println(value);
    }

}
