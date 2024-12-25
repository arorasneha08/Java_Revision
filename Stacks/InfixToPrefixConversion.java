import java.util.Stack;

public class InfixToPrefixConversion {
    public static String reverse(String s){
        char ch[] = s.toCharArray(); 
        int left = 0; 
        int right = s.length() - 1 ;

        while(left <= right){
            if(ch[left] == '(') ch[left] = ')'; 
            else if(ch[left] == ')') ch[left] = '(' ; 

            if(ch[right] == '(') ch[right] = ')'; 
            else if(ch[right] == ')') ch[right] = '(' ; 

            char temp = ch[left]; 
            ch[left] = ch[right]; 
            ch[right] = temp; 

            left ++ ;
            right --; 
        }
        return new String(ch);
    }
    public static int checkPriority(char ch){
        if(ch == '^') return 3 ; 
        else if(ch == '+' || ch == '-') return 1; 
        else if(ch == '*' || ch == '/') return 2 ; 
        return -1 ; 
    }
    public static void main(String[] args) {
        String str = "a+b*(c^d-e)"; 
        str = reverse(str);

        Stack<Character> st = new Stack<>(); 
        String ans = "" ; 

        for(int i = 0 ; i<str.length() ; i++){
            if((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >='a' && str.charAt(i) <= 'z') || (str.charAt(i) >= '0' && str.charAt(i) <= '9')){
                ans += str.charAt(i);
            }
            else if(str.charAt(i) == '('){
                st.push(str.charAt(i)); 
            }
            else if(str.charAt(i) == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    ans += st.peek();
                    st.pop();  
                }
                st.pop(); 
            }
            else{
                if(str.charAt(i) == '^'){
                    while(!st.isEmpty() && checkPriority(str.charAt(i)) <= checkPriority(st.peek())){
                        ans += st.peek();
                        st.pop();
                    }
                    st.push(str.charAt(i)); 
                }
                else{
                    while(!st.isEmpty() && checkPriority(str.charAt(i)) < checkPriority(st.peek())){
                        ans += st.peek();
                        st.pop(); 
                    }
                    st.push(str.charAt(i)); 
                }
            }
        }
        while(!st.isEmpty()){
            ans += st.peek() ;
            st.pop(); 
        }
        ans = reverse(ans);
        System.out.println(ans);
    }
}
