// public class InsertAtIndexDLL {
//     class Solution {
//         // Function to insert a new node at given position in doubly linked list.
//         Node addNode(Node head, int p, int x) {
//             Node t = new Node(x); 
//             Node temp = head ;
//             if(head == null){
//                 return t;  
//             }
//             for(int i = 0 ; i< p ; i++){
//                 temp = temp.next ; 
//             }
//             t.next = temp.next; 
//             t.prev = temp; 
            
//             if (temp.next != null) {
//                 temp.next.prev = t; 
//             }
//             temp.next = t ; 
//             return head; 
//         }
//     }
// }
