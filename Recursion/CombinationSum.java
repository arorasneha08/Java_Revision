import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    class Solution {
    public void sum(int arr[] , int target , int index , int sum ,List<Integer> ans, List<List<Integer>> result){
        if(sum == target){
            result.add(new ArrayList<>(ans)); 
            return ; 
        }
        if(sum > target) return ; 
        if(index >= arr.length) return ; 

        ans.add(arr[index]);
        sum(arr , target ,index , sum + arr[index] , ans , result);
        ans.remove(ans.size()-1);
        sum(arr, target , index + 1 , sum , ans, result); 
    }
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>(); 
        sum(arr, target , 0 , 0 , ans, result); 
        return result ; 
    }
}
}
