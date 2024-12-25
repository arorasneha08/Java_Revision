public class CapacityToShipPackages {
    class Solution {
        private int max(int arr[]){
            int max = -1;
            for(int i =0 ;  i<arr.length ; i++){
                if(arr[i] > max){
                    max = arr[i] ; 
                }
            }
            return max; 
        }
        private int sum(int arr[]){
            int sum = 0 ;
            for(int i = 0 ; i<arr.length ; i++){
                sum += arr[i]; 
            }
            return sum ; 
        }
        public boolean isPossible(int arr[] , int mid , int days){
            int sum = 0 ; 
            int day = 1 ;
            for(int i = 0; i<arr.length ; i++){
                if(arr[i] > mid){
                    return false;  
                }
                sum += arr[i] ;
                if(sum > mid){
                    day ++; 
                    sum = arr[i] ; 
                }
                if(day > days) return false ; 
            }
            return true ; 
        }
        public int shipWithinDays(int[] weights, int days) {
            int n = weights.length ;
            int start = max(weights) ;
            int end = sum(weights); 
            int ans = -1 ;
            while(start <= end){
                int mid = start + (end - start)/2 ; 
                if(isPossible(weights, mid , days)){
                    ans = mid ;
                    end = mid - 1; 
                }
                else{
                    start = mid + 1 ; 
                }
            }
            return ans ; 
        }
    }
}

// leetocde 1011 