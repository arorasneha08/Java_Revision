public class RemoveNthNodeFromEnd {
//  * Definition for singly-linked list.
public class ListNode {
    int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head ; 
        ListNode fast = head ; 
        ListNode slow = head ; 
        for(int i = 1 ; i<= n ; i++){
            if(fast != null)  fast = fast.next ; 
        }
        // edge case : if we want the nth node from the end i.e. 1st element from start ;
        // position the head by moving to the next element 
        if(fast == null){
            head = head.next ; 
            return head ; 
        }
        while(fast.next != null){
            slow = slow.next ;
            fast = fast.next ; 
        }
        slow.next = slow.next.next; 
        return head ; 
    }
}
}

// leetcode 19 