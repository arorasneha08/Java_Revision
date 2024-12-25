public class InsertAtEnd {
    class Solution {
        // Function to insert a node at the end of the linked list.
        Node insertAtEnd(Node head, int x) {
            Node temp = head ; 
            Node add = new Node(x); 
            if(head == null) return add ;
            else{
                Node current = head ;
                while(current.next != null){
                    current = current.next  ;
                } 
                current.next = add ; 
            }
            return head; 
        }
    }
}
