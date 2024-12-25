import java.util.ArrayList;
import java.util.Arrays;

public class NonOverlappingIntervals {
    class Solution {
        public int eraseOverlapIntervals(int[][] intervals) {
            int n = intervals.length ;
            int count = 0 ; 
            ArrayList<int[]> ans = new ArrayList<>();
            Arrays.sort(intervals , (a,b) -> Integer.compare(a[1] , b[1])); 
            ans.add(intervals[0]); 
            for(int i = 1; i< n ; i++){
                if(intervals[i][0] < ans.get(ans.size()-1)[1]){
                    count ++ ; 
                }
                else{
                    ans.add(intervals[i]); 
                }
            }
            return count ; 
        }
    }
}

// leetcode 435 
