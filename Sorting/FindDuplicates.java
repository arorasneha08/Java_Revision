public class FindDuplicates {
    public class Solution {
        private void cycleSort(int arr[]){
            int n = arr.length ; 
            for(int i = 0 ; i<n ; i++){
                while(arr[i] != i+1){
                    int index = arr[i] - 1 ; 
                    if(arr[index] == arr[i]) break ; 
                    int temp = arr[index] ;
                    arr[index] = arr[i] ;
                    arr[i] = temp ; 
                }
            }
        }
        public int findDuplicate(int[] nums) {
            // HashSet<Integer> set = new HashSet();
            // for(int i = 0; i<nums.length ; i++){
            //     if(set.contains(nums[i])){
            //         return nums[i] ;
            //     }
            //     set.add(nums[i]); 
            // }
            // return -1; 
    
            cycleSort(nums); 
            for(int i = 0 ; i<nums.length ; i++){
                if(nums[i] != i+1){
                    return nums[i] ;
                }
            }
            return -1 ; 
        }
    }
}
// leetcode 287 