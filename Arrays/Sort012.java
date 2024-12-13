public class Sort012 {
    class Solution {
        public void sortColors(int[] nums) {
            // int count_0 = 0 ; 
            // int count_1 = 0 ; 
            // int count_2 = 0 ; 
            // for(int i = 0 ; i<nums.length ; i++){
            //     if(nums[i] == 0) count_0 ++ ; 
            //     if(nums[i] == 1) count_1 ++ ; 
            //     if(nums[i] == 2) count_2 ++ ; 
            // }
            // for(int i = 0 ; i<nums.length ; i++){
            //     if(i<count_0){
            //         nums[i] = 0 ; 
            //     }
            //     else if(i < count_0 + count_1){
            //         nums[i] = 1 ; 
            //     }
            //     else{
            //         nums[i] = 2 ; 
            //     }
            // }
    
            int n = nums.length ; 
            int low = 0;
            int mid = 0; 
            int high = n - 1 ;
            while(mid <= high){
                if(nums[mid] == 0){
                    int temp = nums[mid] ;
                    nums[mid] = nums[low] ; 
                    nums[low] = temp ; 
                    low ++ ;
                    mid ++ ;
                }
                else if(nums[mid] == 1){
                    mid ++ ; 
                }
                else{
                    int temp = nums[mid] ;
                    nums[mid] = nums[high];
                    nums[high] = temp; 
                    high -- ; 
                }
            }
        }
    }
}
