import java.util.Stack;

public class Pattern132 {
    class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length ; 
        Stack<Integer> st = new Stack<>() ; 
        int third = Integer.MIN_VALUE ; 
        for(int i = n-1 ; i>= 0; i--){
            if(nums[i] < third) return true ;
            while(!st.isEmpty() && st.peek() < nums[i]){
                third = st.pop(); 
            }
            st.push(nums[i]);
        } 
        return false;
    }
}
}

// leetocode 456 