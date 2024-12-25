public class SearchInsertPostion {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int n = nums.length ; 
            int start = 0 ;
            int end = n-1 ;
            // initialise ans = n because if the index is not found in teh aray it means that the number is greater than all the elements in the array , so its insertion index will be n  
            int ans = n ; 
            while(start <= end){
                int mid = start + (end - start)/2 ;
                if(nums[mid] == target){
                    return mid ; 
                }
                else if(nums[mid] < target){
                    start = mid + 1 ; 
                }
                else{
                    ans = mid  ; 
                    end = mid - 1 ; 
                }
            }
            return ans ; 
        }
    }
}

// leetcode 35 
