import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MergeOverlappingInterval {

    public static List< List< Integer > > mergeOverlappingIntervals(int [][]arr){
        int n = arr.length; 
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i<n ; i++){
            int start = arr[i][0];
            int end = arr[i][1];
            if(!ans.isEmpty() && ans.get(ans.size()-1).get(1) >= end) continue; 
            for(int j = i+1 ; j<n ; j++){
                if(arr[j][0] <= end){
                    end = Math.max(arr[j][1], end); 
                }
                else{
                    break ; 
                }
            }
            ans.add(Arrays.asList(start, end));  
        }
        return ans ; 
    }
}

// optimised code 

class Solution {
    public int[][] merge(int[][] arr) {
        int n = arr.length ;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();
        for(int i = 0 ; i<n ; i++){
            if(ans.size() == 0 || arr[i][0] > (ans.get(ans.size()-1)[1])){
                ans.add(arr[i]);
            }
            else{
                (ans.get(ans.size()-1)[1]) = Math.max((ans.get(ans.size()-1)[1]), (arr[i][1])); 
            }
        }
        return ans.toArray(new int[ans.size()][]) ;
    }
}

// leetcode 56 

// Example 1:

// Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]
// Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].