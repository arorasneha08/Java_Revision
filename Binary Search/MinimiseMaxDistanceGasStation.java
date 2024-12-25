public class MinimiseMaxDistanceGasStation {
    public class Solution {
        public static int numberOfGasStationsRequired(double dist , int[] arr){
            int count = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                double gap = arr[i + 1] - arr[i];
                count += (int) Math.ceil(gap / dist) - 1;
            }
            return count;
        }
        public static double MinimiseMaxDistance(int []arr, int K){
            int n = arr.length; 
            double low = 0  ;
            double high = 0;
            for(int i = 0; i<n-1 ; i++){
                high = Math.max(high, (double) (arr[i+1]-arr[i])); 
            } 
            double diff = 1e-6 ; 
            while(high - low > diff){
                double mid =  (low + high)/2.0 ; 
                int count = numberOfGasStationsRequired(mid , arr); 
                if(count > K){
                    low = mid; 
                }
                else{
                    high = mid; 
                }
            }
            return high ; 
        }
    }
}

// leetcode hard code
