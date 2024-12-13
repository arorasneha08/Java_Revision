import java.util.ArrayList;
import java.util.List;

public class FindDisappearNumArr {
    class Solution {
    private void cycleSort(int arr[]){
        int n = arr.length ; 
        for(int i = 0 ; i<n ; i++){
            while(arr[i] != i+1){
                int index = arr[i] - 1 ; 
                if(arr[i] == arr[index]) break ; 
                int temp = arr[index] ;
                arr[index] = arr[i] ;
                arr[i] = temp; 
            }
        }
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>(); 
        cycleSort(nums) ;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i] != i+1){
                ans.add(i+1);
            }
        }
        return ans ; 
    }
}
}

// solved using the cyclic sort 
// leetcode 448 
