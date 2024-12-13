import java.util.ArrayList;
import java.util.List;

public class Permutations {
    class Solution {
// // method - 2 :- optimised approach 
//     public void permutation(int nums[] , int idx , List<List<Integer>> ans){
//         int n = nums.length ; 
//         if(idx == n-1){
//             List<Integer> l = new ArrayList<>() ; 
//             for(int i = 0 ; i<n ; i++){
//                 l.add(nums[i]); 
//             }
//             ans.add(l) ; 
//             return ; 
//         }
//         for(int i = idx ; i<nums.length ; i++){
//             swap(i , idx, nums);
//             permutation(nums,idx+1, ans); 
//             swap(i,idx,nums); 
//         }
//     }
//     public void swap(int i , int j , int nums[]){
//         int temp = nums[i] ;
//         nums[i] = nums[j] ;
//         nums[j] = temp;  
//     }
//     public List<List<Integer>> permute(int[] arr) {
//         List<List<Integer>> ans = new ArrayList<>() ;
//         permutation(arr,0,ans); 
//         return ans ; 
//     }

    // Method - 1 :-

    public void helper(int nums[] , List<Integer> ds , boolean [] isVisited , List<List<Integer>> ans){
        if(ds.size() == nums.length){
            List<Integer> list = new ArrayList<>() ; 
            for(int i = 0 ; i<ds.size() ; i++){
                list.add(ds.get(i)); 
            }
            ans.add(list); 
            return ; 
        }
        for(int i = 0 ; i<nums.length ; i++){
            if(isVisited[i] == false){
                ds.add(nums[i]) ; 
                isVisited[i] = true;
                helper(nums,ds,isVisited, ans) ;
                isVisited[i] = false; 
                ds.remove(ds.size()-1) ; 
            }
        }
    }
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>() ; 
        List<Integer> ds = new ArrayList<>() ; 
        boolean isVisited[] = new boolean [arr.length] ; 
        helper(arr , ds , isVisited, ans);
        return ans ;  
    }
}
}
