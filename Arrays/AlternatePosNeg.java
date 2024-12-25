class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length ;
        int ans[] = new int[nums.length];
        int posIdx = 0 ; 
        int negIdx = 1 ; 
        for(int i = 0 ; i<n ; i++){
            if(nums[i] < 0){
                ans[negIdx] = nums[i] ; 
                negIdx += 2 ; 
            }
            else{
                ans[posIdx] = nums[i] ; 
                posIdx += 2 ; 
            }
        }
        return ans ; 
    }
}

// leetcode 2149 

// when the return type is void :

// import java.util.* ;
// import java.io.*; 

// public class Solution {
    
//     public static void rearrange(int[] arr) {
//         int n = arr.length; 
//         List<Integer> pos = new ArrayList<>();
//         List<Integer> neg = new ArrayList<>();
//         for(int i = 0 ; i<n; i++){
//             if(arr[i] < 0){
//                 neg.add(arr[i]); 
//             }
//             else{
//                 pos.add(arr[i]); 
//             }
//         }
//         int posIdx = 0 , negIdx = 0 , i = 0 ;
//         while(posIdx < pos.size() && negIdx < neg.size()){
//             arr[i++] = pos.get(posIdx++);  
//             arr[i++] = neg.get(negIdx++);  
//         }
//         while(posIdx < pos.size()){
//             arr[i++] = pos.get(posIdx++);
//         }
//         while(negIdx < neg.size()){
//             arr[i++] = neg.get(negIdx++); 
//         }
//     }

// }