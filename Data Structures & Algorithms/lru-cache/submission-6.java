private class Node{
    int key;
    int val;
    Node prev;
    Node next;

    private Node(int key, int val){
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

class LRUCache {
    private int cap;
    private HashMap<Integer, Node> cache;

    private Node left;

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
        Node prev = node.prev;
        Node nxt = node.next;

        prev.next = nxt;
        nxt.prev = prev;
    }

    private void insert(Node node){
        Node prev = this.right.prev;

        prev.next = node;
        this.right.prev = node;

        node.prev = prev;
        node.next = this.right;
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
        cache.put(key,newNode);

        if(cache.size() > cap){
            Node lru = this.left.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }
}
