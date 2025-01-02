import java.util.HashMap;

public class LRUcache {
    class Node{
    int key ;
    int val ;
    Node prev ;
    Node next ; 

    public Node(int key , int val){
        this.key = key ;
        this.val = val; 
    }
}
class LRUCache {
    private int capacity ;
    private HashMap<Integer , Node> mpp ;
    private Node head ;
    private Node tail ;

    public LRUCache(int capacity) {
        this.capacity = capacity ;
        this.mpp = new HashMap<>(); 
        this.head = new Node(0,0);
        this.tail = new Node(0,0); 
        head.next = tail ;
        tail.prev = head; 
    }
    
    public int get(int key) {
        if(mpp.containsKey(key)){
            Node node = mpp.get(key);
            moveToHead(node); 
            return node.val ; 
        }
        return -1; 
    }
    
    public void put(int key, int value) {
        if(mpp.containsKey(key)){
            Node node = mpp.get(key);
            node.val = value ; 
            moveToHead(node); 
        }
        else{
            Node newNode = new Node(key, value);
            mpp.put(key, newNode);
            addNode(newNode); 

            if(mpp.size() > capacity){
                Node tailNode = popTail();
                mpp.remove(tailNode.key); 
            }
        }
    }

    private void removeNode(Node node){
        Node prev = node.prev ;
        Node next = node.next ; 
        prev.next = next ;
        next.prev = prev ; 
    }

    private void addNode(Node node){
        node.next = head.next ;
        node.prev = head; 
        head.next.prev = node; 
        head.next = node; 
    }

    private void moveToHead(Node node){
        removeNode(node);
        addNode(node); 
    }

    private Node popTail(){
        Node res = tail.prev ;
        removeNode(res);
        return res; 
    }
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
}

// leetcode 146 