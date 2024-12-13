public class RemoveDuplicates {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int n = nums.length ; 
            int uniqueIdx = 0 ;
            for(int i = 1; i<n ; i++){
                if(nums[i] != nums[uniqueIdx]){
                    uniqueIdx ++ ; 
                    nums[uniqueIdx] = nums[i]; 
                }
            }
            return uniqueIdx + 1 ;
        }
    }
}
