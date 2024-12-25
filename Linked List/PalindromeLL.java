// public class PalindromeLL {
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
//         ListNode curr = head ;
//         ListNode left = null ; 
//         ListNode right = null; 
//         while(curr != null){
//             right = curr.next ; 
//             curr.next = left ; 
//             left = curr ; 
//             curr = right ; 
//         }
//         return left ; 
//     }
//     public boolean isPalindrome(ListNode head) {
//         // calculating the left middle element 
//         ListNode slow = head ;
//         ListNode fast = head ; 

//         while(fast.next != null && fast.next.next != null){
//             slow = slow.next ;
//             fast = fast.next.next ; 
//         }
//         ListNode rev = reverse(slow.next);  
//         slow.next = rev ; 
//         ListNode temp1= head ;
//         ListNode temp2 = slow.next ;

//         while(temp2 != null){
//             if(temp1.val != temp2.val) return false ; 
//             temp1 = temp1.next ;
//             temp2 = temp2.next ; 
//         } 
//         return true ; 
//     }
// }
// }

// // leetcode 234 
