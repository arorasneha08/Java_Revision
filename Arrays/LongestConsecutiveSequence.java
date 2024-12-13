import java.util.*;

public class LongestConsecutiveSequence {
    class Solution {
    public int longestConsecutive(int[] nums) {
        // HashSet<Integer>st = new HashSet<>() ;
        // for(int num : nums){
        //     st.add(num) ; 
        // }
        // int maxStreak = 0 ;
        // for(int num : st){
        //     if(!st.contains(num-1)){
        //         int currNum = num ; 
        //         int currStreak = 1 ;
        //         while(st.contains(currNum + 1)){
        //             currStreak ++ ;
        //             currNum ++ ; 
        //         }
        //         maxStreak = Math.max(maxStreak , currStreak) ; 
        //     }
        // }
        // return maxStreak; 


        if (nums.length == 0) {
            return 0;
        }
        
        Arrays.sort(nums); 
        
        int count = 1;  
        int ans = 1;   
        
        // Find the longest consecutive sequence
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) { 
                count++;
            } else if (nums[i] != nums[i - 1]) { 
                ans = Math.max(ans, count);  
                count = 1;
            }
        }
        
        ans = Math.max(ans, count); 
        return ans;
    }
}
}
