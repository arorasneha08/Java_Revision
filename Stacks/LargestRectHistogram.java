// public class LargestRectHistogram {
//     class Solution {
//         public int largestRectangleArea(int[] heights) {
//             int n = heights.length;
//             Stack <Integer> st = new Stack<Integer>() ; 
//             int nse[] = new int[n]; 
//             int pse[] = new int[n];
            
//             st.push(n-1); 
//             nse[n-1] = n ; 
    
//             for(int i = n-2 ; i>= 0 ; i--){
//                 while(st.size()>0 && heights[st.peek()]>=heights[i]){
//                     st.pop(); 
//                 }
//                 if(st.size() == 0) nse[i] = n ;
//                 else nse[i] = st.peek() ; 
//                 st.push(i) ; 
//             }
    
//             //  empty the stack 
//             while(st.size()>0) st.pop(); 
    
//             // calculate pse []
//             st.push(0); 
//             pse[0] = -1 ;
//             for(int i = 0 ; i<= n-1 ; i++){
//                 while(st.size()>0 && heights[st.peek()]>=heights[i]){
//                     st.pop(); 
//                 }
//                 if(st.size() == 0) pse[i] = -1 ;
//                 else pse[i] = st.peek() ; 
//                 st.push(i); 
//             }
    
//             // maximum area of rectangle :
//             int max = -1 ;
//             for(int i = 0 ; i<n ; i++){
//                 int area = heights[i] *(nse[i]-pse[i]-1);
//                 max = Math.max(max,area); 
//             }
//             return max ; 
//         }
//     }
// }


// // leetcode 84 

// optimised approach :- 

import java.util.Stack;

public class LargestRectHistogram {
    class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length ; 
        Stack<Integer> st = new Stack<>(); 
        int maxArea = 0 ;
        for(int i = 0; i<n ; i++){
            while(!st.isEmpty() && heights[st.peek()] > heights[i]){
                int h = heights[st.pop()];
                int w = st.isEmpty() ? i : i - st.peek() - 1; 
                maxArea = Math.max(maxArea , h * w ); 
            }
            st.push(i); 
        }
        while(!st.isEmpty()){
            int h = heights[st.pop()];
            int w = st.isEmpty() ? n : n - st.peek() - 1; 
            maxArea = Math.max(maxArea , h * w ); 
        }
        return maxArea; 
    }
}
}
//leetcode 84 