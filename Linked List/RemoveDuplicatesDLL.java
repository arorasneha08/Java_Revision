// public class RemoveDuplicatesDLL {
//     class Solution{
//         Node removeDuplicates(Node head){
//             Node temp = head ;
//             while(temp != null && temp.next != null){
//                 Node nextNode = temp.next ; 
//                 while(nextNode != null && nextNode.data == temp.data){
//                     Node duplicate = nextNode ;
//                     nextNode = nextNode.next ; 
//                 }
//                 temp.next = nextNode ;
//                 if(nextNode != null) {
//                     nextNode.prev = temp ; 
//                 }
//                 temp = temp.next ; 
//             }
//             return head ; 
//         }
//     }
// }
