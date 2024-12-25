// public class AddTwoNumbers {
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
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode temp1 = l1;
//         ListNode temp2 = l2;
//         ListNode ans = new ListNode(-1);
//         ListNode t = ans ; 
//         int carry = 0 ; 

//         while(temp1 != null && temp2 != null){
//             ListNode temp = new ListNode(-1); 
//             t.next = temp ;
//             temp.val = temp1.val + temp2.val + carry;
//             if(temp.val < 10){
//                 carry = 0 ;
//             }
//             else{
//                 temp.val -= 10 ;
//                 carry = 1; 
//             }
//             temp1 = temp1.next ;
//             temp2 = temp2.next ; 
//             t = t.next ; 
//         }

//         // if any element is left in the list 1
//         while(temp1 != null){
//             ListNode temp = new ListNode(-1);
//             t.next = temp ; 
//             temp.val = temp1.val + carry; 
//             if(temp.val >= 10){
//                 temp.val -= 10 ;
//                 carry = 1; 
//             }
//             else{
//                 carry = 0 ; 
//             }
//             t = t.next ;
//             temp1 = temp1.next;
//         }

//         // if any element is left in the list 2
//         while(temp2 != null){
//             ListNode temp = new ListNode(-1);
//             t.next = temp ; 
//             temp.val = temp2.val + carry; 
//             if(temp.val >= 10){
//                 temp.val -= 10 ;
//                 carry = 1; 
//             }
//             else{
//                 carry = 0 ; 
//             }
//             t = t.next ;
//             temp2 = temp2.next;
//         }

//         // add any carry if remamining 

//         ListNode carr = new ListNode(1); 
//         if(carry > 0){
//             t.next = carr ;
//         }
//         return ans.next ; 
//     }
// }
// }


// // leetcode 2 