import java.util.HashMap; 
public class SubarrayWithXorK {
public class Solution {
    public static int subarraysWithSumK(int []a, int b) {
        // brute force approach :-  
        // int count = 0; 
        // int n = a.length; 
        // for(int i = 0 ; i<n ; i++){
        //     int xorSum = 0; 
        //     for(int j = i ; j<n ; j++){
        //         xorSum ^= a[j] ; 
        //         if(xorSum == b) count ++ ; 
        //     }
        // }
        // return count;

// optimised approach 

        int n = a.length;
        HashMap<Integer, Integer> hashTable = new HashMap<>();
        hashTable.put(0, 1); 
        int count = 0, curSum = 0;

        for (int i = 0; i < n; i++) {
            curSum ^= a[i]; 
            int xor = curSum ^ b; 

            if (hashTable.containsKey(xor)) {
                count += hashTable.get(xor);
            }

            hashTable.put(curSum, hashTable.getOrDefault(curSum, 0) + 1);
        }

        return count;
    }
}
}
