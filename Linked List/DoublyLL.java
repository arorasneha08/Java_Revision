// public class DoublyLL {
//     public static class Node{
//         int val ;
//         Node next ; 
//         Node prev ;
//         Node(int val){
//             this.val = val ;
//         }
//     }
//     public static void display(Node head){
//         Node temp = head ;
//         while(temp != null){
//             System.out.print(temp.val + " ");
//             temp = temp.next ; 
//         }
//         System.out.println();
//     }
//     public static void displayRev(Node head){
//         Node temp = head ;

//         while(temp != null && temp.next != null){
//             temp = temp.next ; 
//         }

//         while(temp != null){
//             System.out.print(temp.val + " ");
//             temp = temp.prev ; 
//         }
//         System.out.println();
//     }
//     public static void displayRandomNode(Node random){
//         Node temp = random ; 

//         while(temp.prev != null){
//             temp = temp.prev ; 
//         }

//         while(temp != null){
//             System.out.print(temp.val + " ");
//             temp = temp.next ;
//         }
//         System.out.println();
//     }
//     public static Node insertAtHead(Node head , int val){
//         Node temp = new Node(val);
//         if(head == null){
//             return temp ;
//         }
//         head.prev = temp ; 
//         temp.next = head ;
//         head = temp  ; 
//         return head ;
//     }
//     public static Node insertAtTail(Node head , int val){
//         Node t = head ; 
//         Node temp = new Node(val);
//         if(head == null){
//             return temp ; 
//         }
//         while(head.next != null){
//             head = head.next ; 
//         }
//         head.next = temp ; 
//         temp.prev = head ; 
//         return t ; 
//     }

//     public static Node insertAtIndex(Node head, int val, int index){
//         Node t = head ; 
//         Node temp = new Node(val) ; 
//         for(int i = 0 ; i<index ; i++){
//             head = head.next ; 
//         }
//         Node r = head.next ; 
//         head.next = temp ;
//         temp.prev = head;  
//         temp.next = r;
//         r.prev = temp;
//         return t ; 
//     }

//     public static Node deleteAtHead(Node head){
//         Node t = head ; 
//         head = head.next ;
//         head.prev = null;
//         return head; 
//     }

//     public static void main(String[] args) {
//         Node head = null ;
//         head = insertAtHead(head, 0); 
//         head = insertAtHead(head, 1); 
//         head = insertAtHead(head, 2); 
//         display(head);
//         insertAtTail(head, 3);
//         display(head);
//         insertAtIndex(head, 4, 2);
//         display(head);
//         deleteAtHead(head); 
//         display(head);
//     }
// }
