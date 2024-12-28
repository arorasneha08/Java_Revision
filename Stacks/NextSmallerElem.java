import java.util.Stack;

public class NextSmallerElem {
    class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length ; 
        int res[] = new int[n]; 
        Stack<Integer> st = new Stack<>(); 
        for(int i = n-1 ; i >=0 ; i--){
            while(!st.isEmpty() && st.peek() > prices[i]){
                st.pop();
            }
            if(st.size() > 0){
                res[i] = prices[i] - st.peek(); 
            }
            else{
                res[i] = prices[i]; 
            }
            st.push(prices[i]); 
        }
        return res;
    }
}
}

// leetcode 1475 