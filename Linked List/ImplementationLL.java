public class ImplementationLL {
    Node tail = null ; 
    Node head = null ;
    int size = 0 ; 

    public static class Node{
        int data ; // value
        Node next ; // address of the next node 
        Node(int data){
            this.data = data ;
        }
    }
    public void display(){
        Node temp = head ; 
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next ; 
        }
        System.out.println();
    }
    public void insertAtEnd(int val){
        Node temp = new Node(val); 
        if(head == null) {
            head= temp ; 
            tail = temp; 
        }
        else{
            Node current = head ; 
            while(current.next != null){
                current = current.next; 
            }
            current.next = temp; 
            tail = temp; 
        }
        size ++ ; 
    }
    public void insertAtEndTail(int val){
        Node temp = new Node(val); 
        Node current = head ; 
        if(current == null){
            current = temp ; 
            tail = temp ; 
        }
        else{
            tail.next = temp ; 
            tail = temp ; 
        }
        size ++ ; 
    }
    public int size(){
        Node temp = head ;
        int count = 0 ;
        while(temp  != null){
            count ++ ; 
            temp = temp.next ; 
        }
        return count ; 
    }
    public void insertAtStart(int val){
        Node temp = new Node(val); 
        if(head == null) {
            head = temp ;
            tail = temp;  
        }
        else{
            temp.next = head ; 
            head = temp;  
        }
        size ++ ; 
    }
    public void insertAtIndex(int val , int index){
        if(index == 0){
            insertAtStart(val);
            return ; 
        }
        if(index == size()){
            insertAtEnd(val);
            return; 
        }
        Node temp = head ; 
        Node add = new Node(val); 
        for(int i = 1 ; i<index ; i++){
            temp = temp.next ; 
        }
        add.next = temp.next; 
        temp.next = add; 
        size ++ ; 
    }
    public int getValueAtIdx(int index){
        Node temp = head ; 
        for(int i = 0 ; i< index ; i++){
            temp = temp.next ; 
        }
        return temp.data ; 
    }
    public void deleteAtIndex(int index){
        if(index == 0){
            head = head.next ;
            size -- ; 
            return ; 
        }
        Node temp = head ; 
        if(index == size-1){
            tail = temp ; 
        }
        for(int i = 0 ; i<index-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next; 
        size --  ; 
    }
    public static void main(String[] args) {
        ImplementationLL ll = new ImplementationLL();
        ll.insertAtEnd(0);
        ll.insertAtEnd(1);
        ll.display();
        ll.insertAtEndTail(12);
        ll.insertAtEndTail(15);
        ll.display();
        // System.out.println(ll.size());
        ll.insertAtStart(20);
        ll.display();
        ll.insertAtIndex(18, 4);
        ll.display();
        // System.out.println(ll.getValueAtIdx(5));
        // System.out.println(ll.size);      
        ll.deleteAtIndex(5);
        ll.display();  
    }
}