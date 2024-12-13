import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PrintSubsets {
    class Solution {
    public List<List<Integer>> subsets(int arr[] , int index, List<Integer> ans ){
        List<List<Integer>> result = new ArrayList<>(); 
        if(index == arr.length){
            result.add(new ArrayList<>(ans)); 
            return result ; 
        }
        ans.add(arr[index]); 
        result.addAll(subsets(arr, index + 1 , ans));
        ans.remove(ans.size()-1); 
        result.addAll(subsets(arr, index + 1 , ans)); 

        return result; 

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); 
        int n = nums.length; 
        List<List<Integer>> result = subsets(nums, 0, new ArrayList<>());
        HashSet<List<Integer>> set = new HashSet<>(result); 
        return new ArrayList<>(set); 
    }
}
}

// leetcode 90 