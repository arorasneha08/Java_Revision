// import java.util.ArrayList;

// public class SumTargetDLL {
//     class Solution {
//     public static Node findTail(Node head){
//         Node temp = head ;
//         while(temp.next != null){
//             temp = temp.next ; 
//         }
//         return temp ; 
//     }
//     public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
//         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//         Node left = head ; 
//         Node right = findTail(head);
//         while(left.data < right.data){
//             if(left.data + right.data == target){
//                 ArrayList<Integer> pair = new ArrayList<>();
//                 pair.add(left.data);
//                 pair.add(right.data);
//                 ans.add(pair);
                
//                 left = left.next ;
//                 right = right.prev ; 
//             }
//             else if(left.data + right.data < target){
//                 left = left.next ; 
//             }
//             else{
//                 right = right.prev ; 
//             }
//         }
//         return ans ;
//     }
// }
// }
