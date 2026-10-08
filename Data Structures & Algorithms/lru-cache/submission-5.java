private class Node{
    int key;
    int val;
    Node prev;
    Node next;

    private Node(int key, int value){
        this.key = key;
        this.val = value;
        this.prev = null;
        this.next = null;
    }
}

class LRUCache {
    private int cap;
    private HashMap<Integer, Node> cache;
    // left side for LRU
    private Node left;
    // right side for MRU
    private Node right;

    public LRUCache(int capacity) {
        this.cap = capacity;
        this.cache = new HashMap<>();
        this.left = new Node(0,0);
        this.right = new Node(0,0);

        this.left.next = this.right;
        this.right.prev = this.left;    
    }

    private void remove(Node node){
        Node nxt = node.next;
        Node prev = node.prev;

        prev.next = nxt;
        nxt.prev = prev;
    }

    private void insert(Node node){
        Node prev = this.right.prev;

        prev.next = node;
        this.right.prev = node;

        node.next = this.right;
        node.prev = prev;
    }

    public int get(int key) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            remove(cache.get(key));
        }        

        Node newNode = new Node(key,value);
        insert(newNode);
        cache.put(key ,newNode);

        if(cache.size() > cap){
            Node lru = this.left.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }
}
