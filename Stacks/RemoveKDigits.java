import java.util.Stack;

public class RemoveKDigits {
    class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i< num.length() ; i++){
            while(!st.isEmpty() && k > 0 && st.peek() > num.charAt(i)){
                st.pop(); 
                k--;
            }
            st.push(num.charAt(i)); 
        }
        // if still elements are left in stack and k > 0 

        while(k > 0 && !st.isEmpty()){
            st.pop(); 
            k-- ;
        }
        if(st.isEmpty()) return "0" ; 

        // append stack elem in string and reverse to get the required ans 

        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop()); 
        } 
        str.reverse(); 

        // if there are zeros in the starting remove them  
        while(str.length() > 0 && str.charAt(0) == '0'){
            str.deleteCharAt(0); 
        }
        if(str.length() == 0) return "0" ; 
        return str.toString(); 
    }
}
}

// leetcode 402 