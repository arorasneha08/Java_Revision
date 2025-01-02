// import java.util.HashMap;

// public class WordPattern {
//     class Solution {
//     public boolean wordPattern(String pattern, String s) {
//         HashMap<Character , String> mpp = new HashMap() ;
//         String str[] = s.split(" "); 
//         if (pattern.length() != str.length) {
//             return false;
//         }
//         for(int i = 0 ; i< pattern.length() ; i++){
//             char ch = pattern.charAt(i) ;
//             if(mpp.containsKey(ch)){
//                 if(!mpp.get(ch).equals(str[i])){
//                     return false; 
//                 }
//             }
//             else if(mpp.containsValue(str[i])){
//                 return false; 
//             }
//             else{
//                 mpp.put(ch , str[i]); 
//             }
//         }
//         return true ; 
//     }
// }
// }

// //leetcode 290 