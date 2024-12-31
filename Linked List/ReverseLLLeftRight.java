// public class ReverseLLLeftRight {
//     class Solution {
//         public ListNode reverseBetween(ListNode head, int left, int right) {
//             if(head == null || left == right){
//                 return head ;
//             }
//             ListNode d = new ListNode(-1);
//             d.next = head ; 
//             ListNode prev = d ; 
//             for(int i = 0; i<left - 1 ; i++){
//                 prev = prev.next ; 
//             }
//             ListNode curr = prev.next ;
//             for(int i = 0 ; i< right - left;  i++){
//                 ListNode nexxt = curr.next ;
//                 curr.next = nexxt.next ;
//                 nexxt.next = prev.next ; 
//                 prev.next = nexxt ; 
//             }
//             return d.next ;
//         }
//     }
// }

// // leetcode 92 