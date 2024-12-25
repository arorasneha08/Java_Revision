public class MaxChunksToMakeSorted {
    class Solution {
        public int maxChunksToSorted(int[] arr) {
            int n = arr.length ; 
            int maxSeen = 0 ;
            int count = 0 ;
            for(int i = 0; i<n ; i++){
                maxSeen = Math.max(maxSeen , arr[i]);
                if(maxSeen == i) {
                    count ++ ; 
                }
            }
            return count ; 
        }
    }
}

// leetcde 769 