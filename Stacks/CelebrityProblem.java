public class CelebrityProblem {
    class Solution {
        public int celebrity(int mat[][]) {
            int n = mat.length; 
            
            // Step 1: Identify a potential celebrity
            int top = 0;
            int down = n - 1;
            
            while (top < down) {
                if (mat[top][down] == 1) {
                    top++;
                } else {
                    down--;
                }
            }
            
            int candidate = top;
    
            // Step 2: Verify the candidate
            for (int i = 0; i < n; i++) {
                if (i != candidate) {
                    if (mat[candidate][i] == 1 || mat[i][candidate] == 0) {
                        return -1;
                    }
                }
            }
            return candidate;
        }
    }
}
