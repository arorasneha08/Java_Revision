public class MedianOfTwoSortedArrays {
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {

            // brute force approach :- 

            // int n1 = nums1.length ; 
            // int n2 = nums2.length ;
            // int i = 0 , j = 0;
            // ArrayList<Integer> ans = new ArrayList<>(); 
            // while(i < n1 && j < n2){
            //      if(nums1[i] < nums2[j]){
            //         ans.add(nums1[i]); 
            //         i++;
            //     }
            //     else {
            //         ans.add(nums2[j]); 
            //         j++ ; 
            //     }
            // }
            // while(i < n1){
            //     ans.add(nums1[i]);
            //     i++;
            // }
            // while(j < n2){
            //     ans.add(nums2[j]);
            //     j++; 
            // }
            // int len = ans.size();
            // if(len % 2 == 1){
            //     return (double) ans.get(len/2); 
            // }
            // return (double) (ans.get(len/2) + ans.get(len/2-1))/2 ; 
    
            // optimised approach using binary search :- 
            int n1 = nums1.length; 
            int n2 = nums2.length ; 
            if(n1 > n2) return findMedianSortedArrays(nums2 , nums1) ;
            int n = n1 + n2; 
            int low = 0 ; 
            int high = n1;
            int left = (n1 + n2 + 1)/2 ;
            while(low <= high){
                int mid1 = (low + high)/ 2 ; 
                int mid2 = left - mid1 ;
                int l1 = Integer.MIN_VALUE , l2 = Integer.MIN_VALUE ;
                int r1 = Integer.MAX_VALUE , r2 = Integer.MAX_VALUE ; 
                if(mid1 < n1) r1 = nums1[mid1];
                if(mid2 < n2) r2 = nums2[mid2] ; 
                if(mid1 -1 >= 0) l1 = nums1[mid1 - 1];
                if(mid2 -1 >= 0) l2 = nums2[mid2 - 1]; 
                if(l1 <= r2 && l2 <= r1){
                    if(n % 2 == 1) return Math.max(l1 , l2);
                    return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
                }
                else if(l1 > r2) high = mid1 - 1; 
                else low = mid1 + 1 ; 
            }
            return 0 ; 
        }
    }
}


// leetcode 4 :- 

// nums1 [] = {1,3,4,7,10,12}
// nums2 [] = {2,3,6,15};