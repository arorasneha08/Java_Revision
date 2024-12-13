public class PowerOfNum {
    class Solution {
        public double myPow(double x, int n) {
            if(n == 0) return 1 ;
            double smallAns = myPow(x , n/2);
            if(n < 0){
                x = 1 / x ; 
            }
            if(n % 2 == 0){
                return smallAns * smallAns ;
            }
            else{
                return x * smallAns * smallAns ; 
            }
        }
    }
    
}

// leetcode 50 : handling the power of negative numbers 