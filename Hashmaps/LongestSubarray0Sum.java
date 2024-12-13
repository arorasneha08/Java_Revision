
import java.util.HashMap;

public class LongestSubarray0Sum{
    int maxLen(int arr[]) {
        HashMap<Integer, Integer>mpp = new HashMap<>();
        int sum = 0; 
        int maxLen = 0; 
        int len = 0;
        int k = 0 ;
        int n = arr.length ;
        for(int i = 0 ; i<n ; i++){
            sum += arr[i] ; 
            if(sum == 0){
                maxLen = Math.max(maxLen , i+1);
            }
            int rem = sum - k;
            if(mpp.containsKey(rem)){
               len = i - mpp.get(rem);
               maxLen = Math.max(len, maxLen);
            }
            if(!mpp.containsKey(sum)){
                mpp.put(sum , i);
            }
        }
        return maxLen; 
    }
    public static void main(String[] args) {
        
    }
}

// arr[] = [15, -2, 2, -8, 1, 7, 10, 23]