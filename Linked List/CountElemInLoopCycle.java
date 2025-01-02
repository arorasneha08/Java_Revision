// public class CountElemInLoopCycle {
//     class Solution {
//         public int countNode(Node slow){
//             int count = 1 ;
//             Node current = slow ; 
//             while(current.next != slow){
//                 current = current.next ; 
//                 count ++ ; 
//             }
//             return count ; 
//         }
//         // Function to find the length of a loop in the linked list.
//         public int countNodesinLoop(Node head) {
//             Node slow = head ;
//             Node fast = head ; 
//             while(fast != null || fast.next != null){
//                 slow = slow.next ;
//                 fast = fast.next.next ; 
//                 if(slow == fast){
//                     return countNode(slow); 
//                 }
//             }
//             return 0 ; 
//         }
//     }
// }
