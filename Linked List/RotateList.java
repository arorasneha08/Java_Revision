// public class RotateList {
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
//     // public ListNode reverse(ListNode head){
//     //     ListNode curr = head ;
//     //     ListNode prev = null ;
//     //     ListNode agla = null;
//     //     while(curr != null){
//     //         agla = curr.next ;
//     //         curr.next = prev ; 
//     //         prev = curr ;
//     //         curr = agla ; 
//     //     }
//     //     return prev ;
//     // }
//     public static ListNode findKthNode(ListNode temp , int k){
//         while(temp != null && k > 0){
//             k -- ; 
//             temp = temp.next ; 
//         }
//         return temp ; 
//     }
//     public ListNode rotateRight(ListNode head, int k) {
//     //     if (head == null || head.next == null || k == 0) {
//     //         return head; 
//     //     }
//     //     ListNode rev = reverse(head); 
//     //     ListNode t = rev ;

//     //     int count = 0 ; 
//     //     while(t != null){
//     //         count ++ ; 
//     //         t = t.next ; 
//     //     }
//     //     k = k % count ;

//     //     if(k == 0){
//     //         return reverse(rev) ;
//     //     }
//     //     ListNode kthNode = findKthNode(rev , k-1);

//     //     ListNode nextNode = kthNode.next ;
//     //     kthNode.next = null; 

//     //     ListNode firstPart = reverse(rev);
//     //     ListNode secondPart = reverse(nextNode); 

//     //     ListNode temp = firstPart;
//     //     while(temp.next != null){
//     //         temp = temp.next ;
//     //     }
//     //     temp.next = secondPart; 
//     //     return firstPart ; 

//         if(head == null || k == 0 || head.next == null){
//             return head ; 
//         }
//         ListNode temp = head ; 
//         int count = 1 ; 
//         while(temp.next != null){
//             count ++ ; 
//             temp = temp.next ; 
//         }
//         k = k % count ; 
//         if(k == 0) return head ; 

//         temp.next = head; 
//         ListNode kthNode =  findKthNode(temp , count - k);
//         ListNode newHead = kthNode.next ; 
//         kthNode.next = null ; 

//         return newHead ;
//     }
// }
// }

// leetcode 61 