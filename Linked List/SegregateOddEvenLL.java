// public class SegregateOddEvenLL {
//     public class ListNode {
//         int val;
//         ListNode next;
//         ListNode() {}
//         ListNode(int val) { this.val = val; }
//         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//     }
//     public ListNode segregateOddEven(ListNode head){
//         ListNode oddDummy = new ListNode(-1);
//         ListNode evenDummy = new ListNode(-1);
//         ListNode odd = oddDummy; 
//         ListNode even = evenDummy ; 
//         while(head != null){
//             if(head.val % 2 == 0){
//                 even.next = head ; 
//                 even = even.next ; 
//             }
//             else{
//                 odd.next = head ; 
//                 odd = odd.next ; 
//             }
//             head = head.next ; 
//         }
//         even.next = null ; 
//         odd.next = null; 
//         return List.of(oddDummy.next , evenDummy.next); 
//     }
// }
