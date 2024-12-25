import java.util.HashMap;

public class CountSubarraySumK {
    public static int findAllSubarraysWithGivenSum(int arr[], int target) {
        int n = arr.length ;
        int count = 0 ; 
        int sum = 0 ; 
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1); 
        for(int i = 0; i<n; i++){
            sum += arr[i]; 
            int rem = sum- target ;
            if(mpp.containsKey(rem)){
                count += mpp.get(rem);  
            }
            mpp.put(sum, mpp.getOrDefault(sum, 0) + 1); 
        }
        return count; 
    }
}

// code 360 :  Count All Subarrays With Given Sum