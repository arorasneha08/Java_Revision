public class jumpGame {
    class Solution {
        public boolean canJump(int[] arr) {
            int finalPos = arr.length -1 ;
            for(int i = arr.length - 2 ; i>=0 ; i--){
                if(i + arr[i] >= finalPos){
                    finalPos = i ; 
                }
            }
            return finalPos == 0 ; 
        }
    }
}

// leetcde 55 