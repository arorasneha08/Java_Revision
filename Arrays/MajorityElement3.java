import java.util.ArrayList;
import java.util.List;

public class MajorityElement3 {
    class Solution {
    public List<Integer> majorityElement(int[] arr) {

// method 1 : Hashmaps 

        // HashMap<Integer, Integer> mpp = new HashMap<>();
        // List<Integer> ans = new ArrayList<Integer>(); 
        // int n = arr.length; 
        // int mini = (int) (n/3)+1 ; 
        // for(int i = 0 ; i<n ; i++){
        //     mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
        //     if(mpp.get(arr[i]) == mini){
        //         ans.add(arr[i]);
        //     }
        //     if(ans.size() == 2) break ;
        // }
        // return ans; 

// method 2 : Boyer Moore Majority voting algorithm 

        int n = arr.length ; 
        int count1  = 0 ,  count2 = 0 ; 
        int elem1 = Integer.MIN_VALUE , elem2 = Integer.MIN_VALUE  ; 
        for(int i = 0 ; i< n ; i++){
            if(count1 == 0 && arr[i] != elem2){
                count1 = 1 ;
                elem1 = arr[i]; 
            }
            else if(count2 == 0 && arr[i] != elem1){
                count2 = 1 ;
                elem2 = arr[i]; 
            }
            else if(arr[i] == elem1) count1 ++ ; 
            else if(arr[i] == elem2) count2 ++ ; 
            else{
                count1 -- ; 
                count2 -- ; 
            }
        }
        List<Integer> ans = new ArrayList<>(); 
        count1 = 0 ; count2 = 0 ; 
        for(int i = 0 ; i<n ; i++){
            if(elem1 == arr[i]){
                count1 ++ ; 
            }
            if(elem2 == arr[i]){
                count2 ++ ; 
            }
        }
        int mini = (int) (n/3) + 1 ; 
        if(count1 >= mini){
            ans.add(elem1); 
        }
        if(count2 >= mini){
            ans.add(elem2); 
        }
        return ans ; 
    }
}
}
