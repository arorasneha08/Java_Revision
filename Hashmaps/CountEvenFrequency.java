import java.util.HashMap;

public class CountEvenFrequency{
    class Solution {
    public int mostFrequentEven(int[] nums) {
        int ans  = -1; 
        HashMap<Integer , Integer> mpp = new HashMap<>();
        int n = nums.length ;

        for(int i = 0 ;  i<n ; i++){
            if(nums[i] % 2 == 0) {
                mpp.put(nums[i] , mpp.getOrDefault(nums[i] , 0) + 1); 
            }
        }
        int count = 0 ; 

        for(int key : mpp.keySet()){
            int freq = mpp.get(key);
            if(freq > count || freq == count && key < ans){
                count = freq ; 
                ans = key ;
            }
        }
        return ans ; 
    }
}
    public static void main(String[] args){
        
    }
}

// leetcode 1838 