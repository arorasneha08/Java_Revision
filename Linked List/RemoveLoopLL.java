// import java.util.ArrayList;
// public class RemoveLoopLL {

// public class Solution {
//   public static Node removeLoop(Node head) {
//     if(head == null || head.next == null){
//       return null; 
//     }
//     Node slow = head ;
//     Node fast = head ;
//     while(fast != null && fast.next != null){
//       slow = slow.next ;
//       fast = fast.next.next ; 
//       if(slow == fast) break; 
//     }
//     if (fast == null || fast.next == null) {
//       return head;
//     }
//     slow = head ;
//     Node prev = null ;
//     while(slow != fast){
//       prev = fast ;
//       slow = slow.next ;
//       fast = fast.next ; 
//     }
//     prev = fast;
//     while (prev.next != fast) { // Find the last node in the loop.
//       prev = prev.next;
//     }
//     prev.next = null; // Break the loop.

//     return head;
//   }
// }
// }
