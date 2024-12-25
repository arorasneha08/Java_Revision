// public class ValidParantheses {
//     class Solution {
//         public boolean isValid(String s) {
//             Stack <Character> st = new Stack<Character>() ; 
//             int n = s.length() ; 
//             for(int i = 0 ; i<n; i++){
//                 char ch = s.charAt(i) ;
//                 if(ch == '(') st.push(')'); 
//                 else if(ch == '[') st.push(']'); 
//                 else if(ch == '{') st.push('}');
//                 else if (st.isEmpty() || st.pop() != ch){
//                     return false ;
//                 }
//             }
//             if(st.isEmpty()){
//                 return true; 
//             } 
//             return false ; 
//         }
//     }
// }

// // leetcode 20 