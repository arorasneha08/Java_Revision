// public class BinarySearch{
//     public static void main(String[] args) {
//         class Solution {
//             private int binarySearch(int arr[] , int target , int start , int end){
//                 if(start > end){
//                     return -1; 
//                 }
//                 int mid = start + (end - start)/2 ;
//                 if(arr[mid] == target){
//                     return mid ; 
//                 } 
//                 else if(target > arr[mid]){
//                     return binarySearch(arr, target , mid+1, end); 
//                 }
//                 return binarySearch(arr, target , start , mid-1); 
//             }
//             public int search(int[] arr, int target) {
//                 int start = 0 ;
//                 int end = arr.length-1;  
//                 int ans = binarySearch(arr, target, start , end);
//                 return ans ; 
//             }
//         }
//     }
// }

// // leetcode 704 