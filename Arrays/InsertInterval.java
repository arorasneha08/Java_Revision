import java.util.ArrayList;

public class InsertInterval {
    class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length ;
        ArrayList<int []> ans = new ArrayList<>(); 
        int i = 0; 

        // add the intervals which are less than the newInterval 
        while(i < n && intervals[i][1] < newInterval[0]){
            ans.add(intervals[i]); 
            i++ ; 
        }

        // merge the overlapping intervals by updating the newInterval and then update the main array 
        while(i < n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0] , newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1] , newInterval[1]); 
            i++ ; 
        }
        ans.add(newInterval); 

        // add the remaining intervals 
        while(i < n){
            ans.add(intervals[i]);
            i++ ; 
        }
        return ans.toArray(new int[ans.size()][]) ;
    }
}
}

// leetcode 57 