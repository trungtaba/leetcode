import java.util.HashMap;

//https://leetcode.com/problems/lru-cache/

class Node{
    int value;
    int key;
    Node next;
    Node previous;

    public Node(int key, int value, Node next, Node previous){
        this.value=value;
        this.key=key;
        this.previous=previous;
        this.next=next;
    }
}

class LRUCache {
    public int capacity;
    Node start, end;
    HashMap<Integer, Node> map;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node= map.get(key);
            removeNode(node);
            addAtTop(node);
            return node.value;
        }
        return -1;
    }

    private void removeNode(Node node){
        if(node.previous!=null)
            node.previous.next=node.next;
        else start=node.next;
        if(node.next!=null)
            node.next.previous=node.previous;
        else end=node.previous;
    }

    private void addAtTop(Node node){
        node.next=start;
        node.previous=null;
        if(start!=null) start.previous=node;
        start=node;
        if(end==null) end=start;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node= map.get(key);
            node.value=value;
            removeNode(node);
            addAtTop(node);
        }else{
            Node newNode=new Node(key, value, null, null);
            if(map.size()>=capacity){
                map.remove(end.key);
                removeNode(end);
                addAtTop(newNode);
            }else{
                addAtTop(newNode);
            }
            map.put(key, newNode);
        }
    }
}