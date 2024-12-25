// public class MaximumTwinSumLL {
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
//     public ListNode reverse(ListNode head){
//         ListNode prev = null ;
//         ListNode after = null ;
//         ListNode curr = head ;
//         while(curr != null){
//             after = curr.next ;
//             curr.next = prev ; 
//             prev = curr ;
//             curr = after ;
//         }
//         return prev ; 
//     }
//     public int pairSum(ListNode head) {
//         ListNode slow = head ;
//         ListNode fast = head ; 

//         while(fast.next != null && fast.next.next != null){
//             slow = slow.next ;
//             fast = fast.next.next; 
//         }
//         ListNode rev = reverse(slow.next); 
//         slow.next = rev ; 
//         ListNode temp1 = head ;
//         ListNode temp2 =  slow.next;
//         int maxSum = 0 ; 
//         while(temp2 != null){
//             int sum = temp1.val + temp2.val ;
//             if(sum > maxSum){
//                 maxSum = sum ;
//             }
//             temp1 = temp1.next ;
//             temp2 = temp2.next ; 
//         } 
//         return maxSum ; 
//     }
// }
// }


// // leetcode 2130 