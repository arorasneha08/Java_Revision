// public class ReverseKthNode {
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
//         ListNode agla = null ; 
//         ListNode curr = head ;
//         while(curr != null){
//             agla = curr.next ;
//             curr.next = prev ;
//             prev = curr; 
//             curr = agla ;
//         }
//         return prev ; 
//     }
//     public ListNode findKthNode(ListNode temp , int k){
        
//         k-=1;
//         while(temp != null && k > 0){
//             k -- ; 
//             temp = temp.next ; 
//         }
//         return temp ; 
//     }
//     public ListNode reverseKGroup(ListNode head, int k) {
//         ListNode temp = head ;
//         ListNode prevNode = null ;
//         ListNode nextNode = null ;

//         while(temp != null){
//             ListNode kthNode = findKthNode(temp, k);
//             if(kthNode == null){
//                 if(prevNode != null){
//                     prevNode.next = temp ; 
//                 }
//                 break; 
//             }
//             nextNode = kthNode.next ;
//             kthNode.next = null; 
//             reverse(temp); 
//             if(temp ==  head){
//                 head = kthNode ; 
//             }
//             else{
//                 prevNode.next = kthNode;
//             }
//             prevNode = temp ;
//             temp = nextNode ; 
//         }
//         return head  ;
//     }
// }
// }

// // leetcode 25 