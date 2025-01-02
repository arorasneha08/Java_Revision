import java.util.Stack;

public class MaximalRectangle {
    class Solution {
        public int largestRectHistogram(int arr[]){
            int n = arr.length ; 
            int maxArea = 0 ;
            Stack<Integer> st = new Stack<>(); 
            for(int i = 0 ; i < n ; i++){
                while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                    int h = arr[st.pop()];
                    int w = (st.isEmpty()) ? i : i - st.peek() - 1; 
                    maxArea = Math.max(maxArea , h * w);
                }
                st.push(i); 
            }
            while(!st.isEmpty()){
                int h = arr[st.pop()];
                int w = (st.isEmpty()) ? n : n - st.peek() - 1; 
                maxArea = Math.max(maxArea , h * w);
            }
            return maxArea ; 
        }
        public int maximalRectangle(char[][] matrix) {
            int r = matrix.length ;
            int c = matrix[0].length ; 
            int prefSum[][] = new int [r][c]; 
            for(int j = 0; j < c ; j++){
                int sum = 0 ; 
                for(int i = 0 ; i < r; i++){
                    int val = matrix[i][j] - '0' ; 
                    sum += val; 
                    if(val == 0) sum = 0 ; 
                    prefSum[i][j] = sum ; 
                }
            }
            int maxArea = 0 ; 
            for(int i = 0 ; i < r ; i++){
                maxArea = Math.max(maxArea , largestRectHistogram(prefSum[i])); 
            }
            return maxArea ; 
        }
    }
}

// leetcode 85 