import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreviousSmallerElem {
    class Solution{
    static List<Integer> leftSmaller(int n, int a[]){
        List<Integer> ans = new ArrayList<>() ;
        Stack<Integer> st = new Stack<>() ; 
        for(int i = 0; i<n ; i++){
            while(!st.isEmpty() && st.peek() >= a[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans.add(-1); 
            }
            else{
                ans.add(st.peek()); 
            }
            st.push(a[i]); 
        }
        return ans ; 
    }
}
}
