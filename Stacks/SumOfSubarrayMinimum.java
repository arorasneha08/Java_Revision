// public class SumOfSubarrayMinimum {
//     class Solution {
//         public int[] findPSE(int arr[]){
//             int n = arr.length;
//             int pse[] = new int[n];
//             Stack<Integer> st = new Stack<>(); 
//             for(int i = 0 ; i < n; i ++){
//                 while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
//                     st.pop(); 
//                 }
//                 pse[i] = st.isEmpty() ? -1 : st.peek(); 
//                 st.push(i); 
//             }
//             return pse; 
//         }
//         public int[] findNSE(int arr[]){
//             int n = arr.length ;
//             Stack<Integer> st = new Stack<>();
//             int nse[] = new int[n]; 
//             for(int i = n-1 ; i>=0 ; i--){
//                 while(!st.isEmpty() && arr[st.peek()] > arr[i]){
//                     st.pop(); 
//                 }
//                 nse[i] = st.isEmpty() ? n : st.peek(); 
//                 st.push(i); 
//             }
//             return nse ; 
//         }
//         public int sumSubarrayMins(int[] arr) {
//             int n = arr.length ; 
//             int nse[] = findNSE(arr);
//             int pse[] = findPSE(arr); 
//             long total = 0 ; 
//             int mod = (int) 1e9 + 7;
    
//             for(int i = 0 ; i<n  ; i++){
//                 int left = i - pse[i]; 
//                 int right = nse[i] - i ; 
//                 total = (total + (long) arr[i] * left * right) % mod;
//             }
//             return (int) total; 
//         }
//     }
// }

// // leetcode 907 