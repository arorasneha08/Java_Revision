// import java.util.ArrayList;

// public class BookAllocation {
//     public static void main(String[] args) {
// public class Solution {
//     private static int max(ArrayList<Integer> arr){
//         int max = 0 ;
//         for(int i = 0 ; i< arr.size() ; i++){
//             if(arr.get(i) > max){
//                 max = arr.get(i) ;
//             }
//         }
//         return max; 
//     }
//     private static int sum(ArrayList<Integer> arr){
//         int sum = 0 ;
//         for(int i = 0 ; i<arr.size() ; i++){
//             sum += arr.get(i); 
//         }
//         return sum ; 
//     }
//     public static boolean isPossible(ArrayList<Integer> arr , int mid , int m){
//         int student = 1 ; 
//         int pages = 0 ;
//         for(int i = 0 ; i<arr.size() ; i++){
//             if(arr.get(i) > mid) return false;  

//             if(pages + arr.get(i) <= mid){
//                 pages += arr.get(i) ; 
//             }
//             else{
//                 student ++; 
//                 pages = arr.get(i); 
//                 if(student > m) return false;
//             }
//         }
//         return true ; 
//     }
//     public static int findPages(ArrayList<Integer> arr, int n, int m) {
//         int start = max(arr) ;
//         int end = sum(arr);
//         int ans = -1 ; 
//         if(m > n){
//             return -1; 
//         }
//         while(start <= end){
//             int mid = start + (end-start)/2;
//             if(isPossible(arr, mid , m)){
//                 ans = mid; 
//                 end = mid - 1; 
//             }
//             else{
//                 start = mid + 1; 
//             }
//         }
//         return ans ; 
//     }
// }
//     }
// }
