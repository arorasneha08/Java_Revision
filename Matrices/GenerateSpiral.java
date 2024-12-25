public class GenerateSpiral {
    class Solution {
        public int[][] generateMatrix(int n) {
           int [][] matrix = new int[n][n];
            int toprow = 0 ;
            int bottomrow  = n-1 ;
            int leftcol = 0 ;
            int rightcol = n - 1 ;
            int curr  = 1 ;
            while (curr <=n*n) {
                for(int j = leftcol ; j<= rightcol && curr <= n*n; j++){
                    matrix[toprow][j]= curr;
                    curr++ ;  
                }
                toprow++ ; 
                for(int i = toprow ; i<=bottomrow && curr <= n*n; i++){
                    matrix[i][rightcol] = curr;
                    curr++ ; 
                }
                rightcol-- ;
                for(int j = rightcol ; j>=leftcol && curr <= n*n; j--){
                    matrix[bottomrow][j] = curr;
                    curr++ ; 
                }
                bottomrow-- ;
                for(int i = bottomrow ; i>=toprow && curr <= n*n;i--){
                    matrix[i][leftcol] = curr;
                    curr++ ; 
                }
                leftcol++ ; 
            }
            return matrix;
        }
    }
}

// leetcode 59 