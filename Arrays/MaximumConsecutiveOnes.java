public class MaximumConsecutiveOnes {
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int n = nums.length ;
            int count = 0 ;
            int max = 0 ;
            for(int i = 0 ; i<n ;i++){
                if(nums[i] == 1) count ++ ; 
                else{
                    max = Math.max(count , max);
                    count = 0 ;
                }
            }
            max = Math.max(count , max);
            return max ;
        }
    }
}

// leetcode 485