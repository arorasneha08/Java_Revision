import java.util.ArrayList;
import java.util.Collections;

public class LeaderInArr {
    class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        int n = arr.length ;
        ArrayList<Integer> list = new ArrayList<>();
        int maxi = Integer.MIN_VALUE; 
        for(int i = n-1 ; i>=0  ; i--){
            if(arr[i] >= maxi){
                list.add(arr[i]); 
                maxi = arr[i] ; 
            }
        }
        Collections.reverse(list); 
        return list;
    }
}

}
