// public class PainterPartitonProblem {
//     import java.util.ArrayList;

// public class Solution {
//     public static int sum(ArrayList<Integer> boards){
//         int n = boards.size();
//         int sum = 0 ; 
//         for(int i = 0 ; i<n ; i++){
//             sum += boards.get(i); 
//         }
//         return sum ; 
//     }
//     public static int max(ArrayList<Integer> boards){
//         int n = boards.size();
//         int max = 0 ; 
//         for(int i = 0 ; i<n ; i++){
//             if(boards.get(i) > max){
//                 max = boards.get(i); 
//             }
//         }
//         return max ; 
//     }
//     public static boolean isPossible(ArrayList<Integer> arr , int mid , int k){
//         int n = arr.size(); 
//         int sum = 0;
//         int painter = 1; 
//         for(int i = 0; i<n ; i++){
//             if(arr.get(i) > mid) return false; 
//             if(sum + arr.get(i) <= mid){
//                 sum += arr.get(i); 
//             }
//             else{
//                 painter ++ ;
//                 sum = arr.get(i); 
//                 if(painter > k) return false; 
//             }
//         }
//         return true ; 
//     }
//     public static int findLargestMinDistance(ArrayList<Integer> boards, int k){
//         int n = boards.size() ; 
//         int start = max(boards);
//         int end = sum(boards);
//         int ans = -1;
//         while(start <= end){
//             int mid = start + (end - start)/2 ; 
//             if(isPossible(boards, mid , k)){
//                ans = mid ;
//                end = mid - 1 ; 
//             }
//             else{
//                 start = mid + 1 ; 
//             }
//         }
//         return ans; 
//     }
// }
// }
