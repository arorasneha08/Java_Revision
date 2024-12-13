public class FrogProblem {
    public static int bestPath(int height[] , int n ,int index){
        // base case 
        if(index == n-1){
            return 0 ; 
        }

        int op1 = Math.abs(height[index + 1] - height[index]) + bestPath(height, n, index+1);
        // if the frog reach the second last elem then there is no way to go to the last elem , it will move one step forward only 
        if(index == n-2){
            return op1  ;
        }
        int op2 = Math.abs(height[index+2]- height[index] + bestPath(height, n, index+2)); 
        return Math.min(op1, op2); 
    }
    public static void main(String[] args) {
        int height[] = {10,30,40,20}; 
        int n = height.length; 
        int ans = bestPath(height, n, 0) ;
        System.out.println(ans);
    }
}
