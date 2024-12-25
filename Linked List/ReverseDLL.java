// public class ReverseDLL {
//     class Solution {
//         public DLLNode reverseDLL(DLLNode head) {
//             if(head == null || head.next == null){
//                 return head ;
//             }
//             DLLNode temp = null ; 
//             DLLNode curr = head ;
            
//             while(curr != null){
//                 temp = curr.prev ;
//                 curr.prev = curr.next ;
//                 curr.next = temp ; 
                
//                 curr = curr.prev ; 
//             }
//             return temp.prev ;
//         }
//     }
// }
