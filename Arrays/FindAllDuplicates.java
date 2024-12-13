import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicates {
    class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> List = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i<nums.length-1 ; i++){
            if(nums[i] == nums[i+1]){
                List.add(nums[i]);
            }
        }
    return List;
    }
}
}
