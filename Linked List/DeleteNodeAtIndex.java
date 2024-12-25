// public class DeleteNodeAtIndex {
//     class Solution {
//         public Node deleteNode(Node head, int x) {
//             if(head == null) return null ; 
//             Node temp = head ; 
            
//             // if head node is to be deleted 
//             if (x == 1) {
//                 temp = head.next; 
//                 if (temp != null) {
//                     temp.prev = null; 
//                 }
//                 return temp; 
//             }
            
//             // at index 
//             for(int i = 1 ; i<x; i++){
//                 temp = temp.next ; 
//             }
            
//             if (temp.next == null) {
//                 temp.prev.next = null; 
//             } 
//             else {
//                 temp.prev.next = temp.next;
//                 temp.next.prev = temp.prev;
//             }
            
//             return head ; 
//         }
//     }
// }
