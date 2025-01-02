public class FindSmallestDivisorThreshold {
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
        private static boolean isPossible(int arr[] , int thres, int mid){
            int sum = 0 ; 
            for(int i = 0; i<arr.length ; i++){
                sum += Math.ceil((double) arr[i] / mid);
    
                if(sum > thres) return false;   
            }
            return (sum <= thres); 
        }
        public int smallestDivisor(int[] nums, int threshold) {
            int start = 1 ;
            int end = max(nums) ; 
            int ans = -1 ; 
            while(start <= end){
                int mid = start + (end - start)/ 2 ;
                if(isPossible(nums, threshold , mid)){
                    ans = mid ;
                    end = mid - 1 ;
                } 
                else {
                    start = mid + 1; 
                }
            } 
            return ans ;
        }
    }
}

// leetcode 1283 