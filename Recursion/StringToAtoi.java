public class StringToAtoi {
    class Solution {
        public int myAtoi(String s) {
            if(s == null || s.isEmpty()){
                return 0 ;
            }
            return helper(s.trim(), 0 , 0 , 1, false); 
        }
        private int helper(String str, int index , int result , int sign , boolean started){
            if(index >= str.length()){
                return result * sign; 
            }
            char currChar = str.charAt(index); 
            if(!started){
                if(currChar == '-'){
                    return helper(str, index + 1 , result , -1 , true); 
                }
                else if(currChar == '+'){
                    return helper(str , index + 1 , result , 1 , true); 
                }
                else if(Character.isDigit(currChar)){
                    return helper(str, index  , result , sign , true); 
                }
                else{
                    return 0 ; 
                }
            }
            if(Character.isDigit(currChar)){
                int digit = currChar - '0' ;
    
                if (result > (Integer.MAX_VALUE - digit) / 10) {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
    
                result = result * 10 + digit ;
                return helper(str, index + 1, result , sign ,true);  
            }
            return result * sign ; 
        } 
    }
}

// leetcode 8 