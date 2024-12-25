public class CountOddNumbersInInterval {
    class Solution {
        public int countOdds(int low, int high) {
            // count odd elements from 1 to low-1 
            int lowCount = low/2 ;
    
            // count odd elements from 1 to high
            int highCount = (high +1 )/2 ; 
    
            // subtracting the high and low will the give the odd numbers in the range 
            return highCount - lowCount ; 
        }
    }
}

// leetcode 1523 