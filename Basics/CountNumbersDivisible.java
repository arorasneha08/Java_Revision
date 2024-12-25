public class CountNumbersDivisible {
    public class Solution {
        public static int countDigits(int n){
            int count = 0 ;
            int num = n ; 
            while(n > 0 ){
                int r = n % 10; 
                // if the digit is zero , check for that 
                if(r != 0 && num % r == 0){
                    count ++ ;
                }
                n = n / 10 ; 
            }
            return count ; 
        }
    }
}
// code 360 : count digits 
