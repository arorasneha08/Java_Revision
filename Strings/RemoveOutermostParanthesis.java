public class RemoveOutermostParanthesis {
    class Solution {
        public String removeOuterParentheses(String s) {
            StringBuilder str = new StringBuilder(); 
            int n = s.length() ;
            int index = 0 ;
            int count = 0 ; 
            for(int i = 0 ; i<n ; i++){
                if(s.charAt(i) == '('){
                    count ++ ; 
                }
                else{
                    count -- ; 
                }
                if(count == 0 ){
                    str.append(s.substring(index + 1 ,i)); 
                    index = i + 1 ; 
                }
            }
            return str.toString(); 
        }
    }
}

// leetcode 1021