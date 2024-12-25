public class FloorOfArray {
    class Solution {

        static int findFloor(int[] arr, int k) {
            int n = arr.length ; 
            int start = 0; 
            int end = n-1 ;
            int ans = -1; 
            while(start <= end){
                int mid = start + (end - start)/2 ; 
                if(arr[mid] == k){
                    return mid ; 
                }
                else if(arr[mid] < k){
                    ans = mid ; 
                    start = mid + 1 ;
                }
                else{
                    end = mid - 1;
                }
            }
            return ans ; 
        }
    }
}
