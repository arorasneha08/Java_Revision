public class KthMissingPositive {
    public static void main(String[] args) {
        class Solution {
            public int findKthPositive(int[] arr, int k) {
                int n = arr.length ;
                int start = 0;
                int end = arr.length-1;
                while(start <= end){
                    int mid = start + (end - start)/2 ; 
                    int missing = arr[mid] - (mid + 1 ) ;
                    if(missing < k){
                        start = mid + 1 ; 
                    }
                    else{
                        end = mid -1 ; 
                    }
                }
                return start + k; 
            }
        }
    }
}

// leetcode 1539 