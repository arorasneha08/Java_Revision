import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

class Solution {
    public void helper(int[] arr, int target, int index, List<Integer> subset, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(subset));
            return;
        }
        if (index >= arr.length || target < 0) {
            return;
        }

        subset.add(arr[index]);
        helper(arr, target - arr[index], index + 1, subset, result); 
        subset.remove(subset.size() - 1); 

        while (index + 1 < arr.length && arr[index] == arr[index + 1]) {
            index++;
        }
        helper(arr, target, index + 1, subset, result); 
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        helper(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
}
}
