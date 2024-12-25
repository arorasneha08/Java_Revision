// public class SortLL {

//     /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode merge(ListNode left , ListNode right){
//         ListNode d = new ListNode(-1);
//         ListNode temp = d ; 

//         while(left != null && right != null){
//             if(left.val < right.val){
//                 temp.next = left; 
//                 left = left.next ; 
//             }
//             else{
//                 temp.next = right; 
//                 right = right.next ; 
//             }
//             temp = temp.next ; 
//         }
//         if(left != null){
//             temp.next = left ; 
//         }
//         else{
//             temp.next = right; 
//         }
//         return d.next ; 
//     }
//     private ListNode middle(ListNode head){
//         ListNode slow = head ;
//         ListNode fast = head ;

//         while(fast.next != null && fast.next.next != null){
//             slow = slow.next ;
//             fast = fast.next.next ; 
//         }
//         return slow ; 
//     }

//     public ListNode sortList(ListNode head) {
//         if(head == null || head.next == null){
//             return head ; 
//         }
//         ListNode mid = middle(head); 
//         ListNode leftHead = head ;
//         ListNode rightHead = mid.next ;
//         mid.next = null ; 

//         leftHead = sortList(leftHead); 
//         rightHead = sortList(rightHead);
        
//         return merge(leftHead , rightHead);
//     }
// }
// }

// // leetcode 148 