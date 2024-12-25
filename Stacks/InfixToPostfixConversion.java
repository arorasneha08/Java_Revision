import java.util.Stack;

public class InfixToPostfixConversion {
    public static int checkPriority(char ch){
        if(ch == '+' || ch == '-'){
            return 1 ;
        }
        else if(ch == '*' || ch == '/'){
            return 2; 
        }
        else if(ch == '^'){
            return 3 ; 
        }
        return -1; 
    }
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>(); 
        String str = "a+b*(c^d-e)"; 

        String ans = "" ; 
        for(int i = 0 ; i< str.length(); i++){
            if((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >='0' && str.charAt(i) <= '9')){
                ans  = ans  + str.charAt(i); 
            }
            else if(str.charAt(i) == '('){
                st.push(str.charAt(i)); 
            }
            else if(str.charAt(i) == ')'){
                while(!st.empty() && st.peek() != '('){
                    ans += str.charAt(i); 
                    st.pop();
                }
                st.pop();
            }
            else { // if it is a operator 
                while(!st.empty() && checkPriority(str.charAt(i)) <= checkPriority(st.peek())){
                    ans += st.peek(); 
                    st.pop();
                }
                st.push(str.charAt(i)); 
            }
        }

        while(!st.empty()){
            ans += st.peek(); 
            st.pop(); 
        }
        System.out.println(ans);
    }
}
