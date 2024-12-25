public class ReverseLL {

    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 // recursive approach :- 

    // public ListNode reverseList(ListNode head) {
    //     if(head == null) return null ;
    //     if(head.next == null){
    //         return head; 
    //     }
    //     ListNode newHead = reverseList(head.next);
    //     head.next.next = head ;
    //     head.next = null ; 
    //     return newHead ; 
    // }

// iterative approach 

// ListNode curr = head ;
//         ListNode left = null;
//         ListNode right = null ;
//         while(curr != null){
//             right = curr.next ; 
//             curr.next = left ; 
//             left = curr ; 
//             curr = right; 
//         } 
//         return left ; 

}
// leetcode 206 
