// public class FinalArrayKmultiplication{
//     public static void main(String[] args) {
//         class Solution {
//             private int getMin(int arr[]){
//                 int index = 0 ; 
//                 int min = Integer.MAX_VALUE ; 
//                 for(int i = 0 ; i<arr.length ; i++){
//                     if(arr[i] < min){
//                         min = arr[i] ; 
//                         index  = i ; 
//                     }
//                 }
//                 return index ; 
//             }
//             public int[] getFinalState(int[] nums, int k, int multiplier) {
//                 int n = nums.length; 
//                 int index = 0 ; 
//                 int minIdx = 0 ;
//                 for(int i = 0; i<k ; i++){
//                     minIdx = getMin(nums); 
//                     nums[minIdx] = nums[minIdx] * multiplier ; 
//                 }
//                 return nums ;
//             }
//         }
//     }
// }

// // leetcode 3264 