// import java.util.Arrays;
// import java.util.*; 

// public class AggressiveCows {
//     public static void main(String[] args) {
// public class Solution {
//     private static int max(int arr[]){
//         int max = 0 ;
//         for(int i = 0 ; i<arr.length ; i++){
//             if(arr[i] > max){
//                 max = arr[i]; 
//             }
//         }
//         return max; 
//     }
//     private static boolean isPossible(int arr[] , int mid , int k){
//         int lastPos = arr[0];
//         int cowCount = 1 ; 
//         for(int i = 1 ;i<arr.length ; i++){
//             if(arr[i] - lastPos >= mid){
//                 cowCount ++ ;
//                 lastPos = arr[i]; 
//                 if(cowCount == k) return true ; 
//             }
//         }
//         return false; 
//     }
//     public static int aggressiveCows(int []stalls, int k) {
//         int n = stalls.length; 
//         Arrays.sort(stalls);
//         int start = 0 ; 
//         int end = stalls[n-1]- stalls[0]; 
//         int ans = -1 ; 
//         while(start <= end){
//             int mid = start + (end - start)/2;
//             if(isPossible(stalls, mid, k)){
//                 ans = mid ;
//                 start = mid + 1 ;
//             }
//             else{
//                 end = mid -1; 
//             }
//         }
//         return ans ; 
//     }
// }
//     }
// }
