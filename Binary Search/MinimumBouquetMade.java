public class MinimumBouquetMade {
    class Solution {
        private static int max(int arr[]){
            int max = 0 ;
            for(int i = 0; i<arr.length ; i++){
                if(arr[i] > max){
                    max = arr[i] ; 
                }
            }
            return max ;
        }
        private static boolean isPossible(int arr[] , int mid , int k , int m){
            int n = arr.length; 
            int count = 0 ; 
            int flowersInBouquet = 0 ; 
            for(int i = 0 ; i<n ; i++){
                if(arr[i] <= mid){
                    flowersInBouquet ++ ; 
                }
                else{
                    flowersInBouquet = 0 ; 
                }
    
                if(flowersInBouquet == k){
                    count ++ ;
                    flowersInBouquet = 0 ;  
                }
                if(count == m){
                    return true ; 
                }
            }
            return false; 
        }
        public int minDays(int[] bloomDay, int m, int k) {
            int n = bloomDay.length ; 
            int start = 1 ; 
            int end = max(bloomDay) ; 
            int ans = -1; 
            if(m * k > bloomDay.length){
                return -1; 
            }
            while(start <= end){
                int mid = start + (end - start)/2 ; 
                if(isPossible(bloomDay, mid, k , m)){
                    ans = mid ; 
                    end = mid - 1 ; 
                } 
                else{
                    start = mid + 1; 
                }
            }
            return ans ; 
        }
    }
}

// leetcode 1482 