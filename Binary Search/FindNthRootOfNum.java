public class FindNthRootOfNum {
    class Solution {
        int func(int mid , int n , int m){
            double ans = 1 ; 
            for(int i = 1 ; i<= n ;i++){
                ans = ans * mid ; 
                if(ans > m) return 2 ; 
            }
            if(ans == m) return 1 ; 
            return 0 ; 
        }
        public int nthRoot(int n, int m) {
            int low = 1 ,high = m ; 
            while(low <= high){
                int mid = (low + high)/2 ;
                int midElem = func(mid, n, m);
                if(midElem == 1){
                    return mid ; 
                }
                else if(midElem == 0) {
                    low = mid + 1 ; 
                }
                else{
                    high = mid - 1 ; 
                }
            }
            return -1;
        }
    }
}
