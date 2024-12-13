public class MajorityElement {
class Solution {
    public int majorityElement(int[] nums) {
        // int n = arr.length; 
        // int maxcount = 0 ; 
        // int index = 0 ; 
        // int count = 1 ; // initialize count to 1
        // int majority = arr[0];
        // Arrays.sort(arr);
        // for(int i = 0 ; i < n; i++){
        //     if(i < n-1 && arr[i] == arr[i+1]){
        //         count ++ ; 
        //     } else {
        //         count = 1; 
        //     }
        //     if(count > maxcount){
        //         maxcount = count ; 
        //         index = i ; 
        //     }
        // }
        // if(maxcount > n/2){
        //     majority = arr[index];
        // }
        // return majority ; 

        int n = nums.length ; 
        int count = 0 ; 
        int elem = -1 ; 
        for(int i = 0 ;i<n ; i++){
            if(count == 0){
                elem = nums[i]; 
            }
            if(nums[i] == elem){
                count ++ ; 
            }
            else{
                count -- ; 
            }
        }
        // int count1 = 0 ;
        // for(int i = 0; i<n ; i++){
        //     if(nums[i] == elem){
        //         count1 ++ ; 
        //     }
        // }
        // if(count1 > (n/2)){
        //     return elem ;
        // }
        return elem; 

    }
}

}
