import java.util.Stack;

public class PostFixToInfixConversion {
    public static void main(String[] args) {
        String str = "abcd^e-*+"; 
        Stack<String> st = new Stack<>(); 

        for(int i = 0; i< str.length() ; i++){
            if((str.charAt(i) >='A' && str.charAt(i) <='Z' )|| (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= '0' && str.charAt(i) <= '9')){
                st.push(Character.toString(str.charAt(i)));
            }
            else{
                String top1 = st.pop();
                String top2 = st.pop();
                String expr = '(' + top2 + str.charAt(i)+ top1 + ')'; 
                st.push(expr); 
            }
        }
        System.out.println(st.peek());
    }
}
 