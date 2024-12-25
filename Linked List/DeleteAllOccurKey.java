// public class DeleteAllOccurKey {
//     class Solution {
//         static Node deleteAllOccurOfX(Node head, int x) {
//             if (head == null) {
//                 return null; 
//             }
    
//             while (head != null && head.data == x) {
//                 head = head.next;
//                 if (head != null) {
//                     head.prev = null;
//                 }
//             }
    
//             Node temp = head;
            
//             while (temp != null) {
//                 if (temp.data == x) {
//                     if (temp.next != null) {
//                         temp.next.prev = temp.prev;
//                     }
//                     if (temp.prev != null) {
//                         temp.prev.next = temp.next;
//                     }
//                 }
//                 temp = temp.next; 
//             }
//             return head; 
//         }
//     }
// }
