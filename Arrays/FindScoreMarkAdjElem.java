import java.util.Arrays;

public class FindScoreMarkAdjElem {
    class Solution {
    public long findScore(int[] nums) {
        int n = nums.length ;
        boolean mark[] = new boolean[n] ; 
        long sum = 0 ;
        Integer indices[] = new Integer[n];

        for(int i = 0 ; i<n ; i++){
            indices[i] = i ;
        } 
        Arrays.sort(indices , (a,b) -> Integer.compare(nums[a], nums[b])); 

        for(int i = 0; i<n ;i++){
            int index = indices[i]; 
            if(!mark[index]){
                sum += nums[index];
                mark[index] = true ; 
                if(index -1 >= 0){
                    mark[index - 1] = true ;
                }
                if(index + 1 < n){
                    mark[index + 1] = true ;
                }
            }
        }
        return sum ; 
    }
}
}

// leetcode 2593 

// optimised approach : priority queue 