import java.util.Stack;

public class PrefixToInfixConversion {
    class Solution {
    static String preToInfix(String pre_exp) {
        Stack<String> st = new Stack<>(); 
        for(int i = pre_exp.length() - 1 ; i>= 0 ; i--){
            char ch = pre_exp.charAt(i); 
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <='z')|| (ch >= '0' && ch <='9')){
                st.push(Character.toString(ch)); 
            }
            else{
                String top1 = st.pop();
                String top2 = st.pop(); 
                String exp = '(' + top1 + ch + top2 + ')';
                st.push(exp); 
            }
        }
        return st.peek() ;
    }
}
}
