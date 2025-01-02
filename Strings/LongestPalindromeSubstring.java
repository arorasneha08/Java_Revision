// public class LongestPalindromeSubstring {
//     class Solution {
//         private boolean checkPalindrome(String str, int left, int right){
//             if(str.length() <= 1) return true ; 
//             while(left < right){
//                 if(str.charAt(left) != str.charAt(right)){
//                     return false; 
//                 }
//                 left ++ ;
//                 right -- ;
//             }
//             return true ; 
//         }
//         public String longestPalindrome(String s) {
//             int n = s.length();
//             int start = 0 ;
//             int end = 0 ;
//             int maxLen = 0 ;
//             if(s.length() <= 1){
//                 return s ;
//             }
//             for(int i = 0 ; i<n ; i++){
//                 for(int j = i; j < n ; j++){
//                     if(checkPalindrome(s, i, j)){
//                         int currLen = j - i + 1 ;
//                         if(currLen > maxLen){
//                             maxLen = currLen ; 
//                             start = i ;
//                         }
//                     }
//                 }
//             }
//             return s.substring(start, start + maxLen); 
//         }
//     }
// }

// // leetcde 5 