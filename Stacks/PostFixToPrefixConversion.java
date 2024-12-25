import java.util.Stack;

public class PostFixToPrefixConversion {
    class Solution {
    static String postToPre(String post_exp) {
        Stack<String> st = new Stack<>() ; 
        
        for(int i = 0; i< post_exp.length() ; i++){
            char ch = post_exp.charAt(i) ;
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= 'z')){
                st.push(Character.toString(ch)); 
            }
            else{
                String top1 = st.pop();
                String top2 = st.pop() ;
                String exp = ch + top2 + top1; 
                st.push(exp); 
            }
        }
        
        return st.peek(); 
    }
}
}
