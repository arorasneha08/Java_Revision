// // public class AddOneToLL {
// //     class Solution {
// //         public Node reverse(Node head){
// //             Node prev = null ;
// //             Node curr = head;
// //             Node agla = null ;
// //             while(curr != null){
// //                 agla = curr.next ;
// //                 curr.next = prev ;
// //                 prev = curr;
// //                 curr = agla; 
// //             }
// //             return prev ;
// //         }
// //         public Node addOne(Node head) {
// //             head = reverse(head);
// //             Node temp = head ;
// //             int carry = 1 ; 
    
// //             while(temp != null){
// //                 temp.data = temp.data + carry ;
// //                 if(temp.data < 10){
// //                     carry = 0 ;
// //                     break ; 
// //                 }
// //                 else{
// //                     temp.data = 0 ;
// //                     carry = 1 ;
// //                 }
// //                 temp = temp.next ; 
// //             }
// //             if(carry == 1){
// //                 Node newNode = new Node(1); 
// //                 head = reverse(head);
// //                 newNode.next = head ;
// //                 return newNode ;
// //             }
// //             return reverse(head); 
// //         }
// //     }
// // }



// class Solution {
//     public int helper(Node temp){
//         if(temp == null){
//             return 1 ;
//         }
//         int carry = helper(temp.next);
//         temp.data += carry ; 
//         if(temp.data < 10) return 0;
//         temp.data = 0 ; 
//         return 1 ; 
//     }
//     public Node addOne(Node head) {
        
//         Node newNode = null;
//         int carry = helper(head);
//         if(carry == 1) {
//             Node newNode = new Node(1);
//             newNode.next = head ; 
//             head = new newNode;
//         }
//         return head ; 
//     }
// }