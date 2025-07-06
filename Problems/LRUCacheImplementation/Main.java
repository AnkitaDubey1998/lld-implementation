package Problems.LRUCacheImplementation;

public class Main {

    public static void main(String[] args) {
        LRUCache<String, Integer> lruCache = new LRUCache<>(3);

        lruCache.put("a", 1);
        lruCache.put("b", 2);
        lruCache.put("c", 3);

        System.out.println(lruCache.get("a")); // 1

        lruCache.put("d", 4);

        System.out.println(lruCache.get("b")); // null
    }

}
