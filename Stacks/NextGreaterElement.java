import java.util.Stack;

public class NextGreaterElement {

public class Solution {
    public static int[] nextGreaterElement(int[] arr, int n) {
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1 ; i>= 0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop(); 
            }
            if(st.isEmpty()){
                ans[i] = -1; 
            }
            else{
                ans[i] = st.peek(); 
            }
            st.push(arr[i]);
        }
        return ans ; 
    }
}
}
