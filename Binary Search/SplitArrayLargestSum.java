public class SplitArrayLargestSum {
    class Solution {
        private int max(int arr[]){
            int max = 0 ;
            for(int i = 0 ; i< arr.length ; i++){
                if(arr[i] > max){
                    max = arr[i] ; 
                }
            }
            return max ; 
        }
        private int sum(int arr[]){
            int sum = 0 ;
            for(int i = 0 ; i< arr.length ; i++){
                sum += arr[i]  ; 
            }
            return sum ; 
        }
        private boolean isPossible(int arr[] ,int mid , int k){
            int split = 1 ;
            int sum = 0 ;
            for(int i = 0; i<arr.length ; i++){
                if(arr[i] > mid) return false; 
                if(sum + arr[i] <= mid){
                    sum += arr[i]; 
                }
                else{
                    split ++ ; 
                    if(split > k ) return false ;
                    sum = arr[i] ; 
                }
            }
            return true ;
        }
        public int splitArray(int[] nums, int k) {
            int start = max(nums); 
            int end = sum(nums);
            int ans = -1;  
            while(start <= end){
                int mid = start + (end - start)/2; 
                if(isPossible(nums, mid , k)){
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

// leetcode 410  