
import java.util.HashMap;

public class CountSubarraySumK {
    class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int sum = 0 ; 
        int count = 0 ; 
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0 ; i<n ; i++){
            sum += nums[i];
            if(sum == k){
                count ++; 
            }
            int rem = sum - k ;
            if(mpp.containsKey(rem)){
                count += mpp.get(rem); 
            }
            mpp.put(sum, mpp.containsKey(sum) ? mpp.get(sum) + 1 : 1);
        }
        return count ; 
    }
}
}
