// public class IntersectionOfLL {
//     /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode(int x) {
//  *         val = x;
//  *         next = null;
//  *     }
//  * }
//  */
// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         if(headA == null || headB == null){
//             return null ; 
//         }
//         ListNode a = headA ; 
//         ListNode b = headB ;
//         int l1 = 0, l2 = 0 ;
//         while(a != null){
//             l1 ++ ;
//             a = a.next ; 
//         }
//         while(b != null){
//             l2 ++ ;
//             b = b.next ; 
//         }
//         a = headA ;
//         b = headB ; 
//         int len = Math.abs(l1-l2); 
//         if(l1 > l2){
//             for(int i = 1;  i<= len ; i++){
//                 a = a.next ; 
//             }
//         }
//         else{
//             for(int i = 1 ; i<= len ; i++){
//                 b = b.next ; 
//             }
//         }
//         while(a != null && b != null){
//             if(a == b) return a ;
//             a = a.next ;
//             b = b.next ; 
//         }
//         return null; 
//     }
// }
// }

// // leetcode 140 