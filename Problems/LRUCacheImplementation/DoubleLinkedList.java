package Problems.LRUCacheImplementation;

public class DoubleLinkedList<K, V> {
    private final Node<K, V> head;
    private final Node<K, V> tail;

    public DoubleLinkedList() {
        head = new Node<>(null, null);
        tail = new Node<>(null, null);
        head.next = tail;
        tail.prev = head;
    }

    public void addAtFirst(Node<K, V> node) {
        Node<K, V> headNext = head.next;
        node.next = headNext;
        node.prev = head;
        head.next = node;
        headNext.prev = node;
    }

    public void remove(Node<K, V> node) {
        Node<K, V> nodePrev = node.prev;
        Node<K, V> nodeNext = node.next;
        node.next = null;
        node.prev = null;
        nodePrev.next = nodeNext;
        nodeNext.prev = nodePrev;
    }

    public Node<K, V> removeLast() {
        if(tail.prev == head) return null;
        Node<K, V> last = tail.prev;
        remove(last);
        return last;
    }
}
